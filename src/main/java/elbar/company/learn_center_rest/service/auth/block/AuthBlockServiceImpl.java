package elbar.company.learn_center_rest.service.auth.block;

import elbar.company.learn_center_rest.criteria.auth.block.AuthBlockCriteria;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockCreateDDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockGetDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.block.AuthBlock;
import elbar.company.learn_center_rest.mapper.auth.block.AuthBlockMapper;
import elbar.company.learn_center_rest.repository.auth.block.AuthBlockRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.block.AuthBlockValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuthBlockServiceImpl extends AbstractService<AuthBlockValidator, AuthBlockMapper, AuthBlockRepository> implements AuthBlockService {

    public AuthBlockServiceImpl(AuthBlockValidator validator, AuthBlockMapper mapper, AuthBlockRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(AuthBlockCreateDDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(AuthBlockUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Optional<AuthBlock> optional = repository.getByCode(DTO.getCode());
        if (optional.isEmpty()) {
            throw new NotFoundException("Auth block not found");
        }
        AuthBlock authBlock = optional.get();
        authBlock.setDuration(DTO.getDuration());
        authBlock.setBlockedReason(DTO.getBlockedReason());
        authBlock.setUpdatedAt(LocalDateTime.now());
        repository.save(authBlock);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<AuthBlock> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Auth block not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<AuthBlockGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Auth block not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<AuthBlockDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Auth block not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<AuthBlockGetDTO>>> list(AuthBlockCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
