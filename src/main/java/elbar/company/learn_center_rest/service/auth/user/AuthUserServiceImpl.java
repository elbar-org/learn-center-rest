package elbar.company.learn_center_rest.service.auth.user;

import elbar.company.learn_center_rest.configs.encryption.PasswordEncoderConfigurer;
import elbar.company.learn_center_rest.criteria.auth.user.AuthUserCriteria;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserGetDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.session.SessionUser;
import elbar.company.learn_center_rest.entity.auth.token.AuthToken;
import elbar.company.learn_center_rest.entity.auth.user.AuthUser;
import elbar.company.learn_center_rest.mapper.auth.user.AuthUserMapper;
import elbar.company.learn_center_rest.repository.auth.user.AuthUserRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.user.AuthUserValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class AuthUserServiceImpl extends AbstractService<AuthUserValidator, AuthUserMapper, AuthUserRepository> implements AuthUserService {
    public AuthUserServiceImpl(AuthUserValidator validator, AuthUserMapper mapper, AuthUserRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(AuthUserCreateDTO DTO) {
        validator.validOnCreate(DTO);
        PasswordEncoderConfigurer encoderConfigurer = new PasswordEncoderConfigurer();
        AuthUser user = mapper.toCreateDTO(DTO);
        user.setPassword(encoderConfigurer.encoder().encode(user.getPassword()));
        repository.save(user);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(AuthUserUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Optional<AuthUser> optional = repository.getByCode(DTO.getCode());
        if (optional.isEmpty()) {
            throw new NotFoundException("Auth User not found");
        }
        AuthUser authUser = optional.get();
        authUser.setEmail(DTO.getEmail());
        authUser.setUsername(DTO.getUsername());
        authUser.setImage(DTO.getImage());
        authUser.setLanguage(DTO.getLanguage());
        repository.save(authUser);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<AuthUser> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Auth User not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<AuthUserGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Auth User not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<AuthUserDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Auth User not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<AuthUserGetDTO>>> list(AuthUserCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }

    @Override
    public SessionUser loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser user = repository.findByUsername(username);
        if (Objects.isNull(user)) {
            throw new NotFoundException("Auth User not found");
        }
        return new SessionUser(this, user);
    }

    public List<String> getRolesByCode(UUID code) {
        return repository.getRolesByCode(code);
    }
}
