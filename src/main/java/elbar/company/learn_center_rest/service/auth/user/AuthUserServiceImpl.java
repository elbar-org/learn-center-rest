package elbar.company.learn_center_rest.service.auth.user;

import elbar.company.learn_center_rest.configs.encryption.PasswordEncoderConfigurer;
import elbar.company.learn_center_rest.criteria.auth.user.AuthUserCriteria;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserGetDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.session.SessionUser;
import elbar.company.learn_center_rest.entity.auth.user.AuthUser;
import elbar.company.learn_center_rest.mapper.auth.user.AuthUserMapper;
import elbar.company.learn_center_rest.repository.auth.user.AuthUserRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.user.AuthUserValidator;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@Transactional
public class AuthUserServiceImpl extends AbstractService<AuthUserValidator, AuthUserMapper, AuthUserRepository> implements AuthUserService {
    public AuthUserServiceImpl(AuthUserValidator validator, AuthUserMapper mapper, AuthUserRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(AuthUserCreateDTO DTO) {
        PasswordEncoderConfigurer encoderConfigurer = new PasswordEncoderConfigurer();
        AuthUser user = mapper.toCreateDTO(DTO);
        user.setPassword(encoderConfigurer.encoder().encode(user.getPassword()));
        repository.save(user);
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(AuthUserUpdateDTO DTO) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<AuthUserGetDTO>> get(UUID key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<AuthUserDetailDTO>> detail(UUID key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<AuthUserGetDTO>>> list(AuthUserCriteria criteria) {
        return null;
    }

    @Override
    public SessionUser loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser user = repository.findByUsername(username);
        if (Objects.isNull(user)) {
            throw new NotFoundException("User not found");
        }
        return new SessionUser(this, user);
    }

    public List<String> getRolesByCode(UUID code) {
        return repository.getRolesByCode(code);
    }
}
