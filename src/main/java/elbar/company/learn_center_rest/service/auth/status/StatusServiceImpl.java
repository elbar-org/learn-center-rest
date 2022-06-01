package elbar.company.learn_center_rest.service.auth.status;

import elbar.company.learn_center_rest.criteria.auth.status.StatusCriteria;
import elbar.company.learn_center_rest.dto.auth.status.StatusCreateDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusDetailDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusGetDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.payment.AuthPayment;
import elbar.company.learn_center_rest.entity.auth.status.Status;
import elbar.company.learn_center_rest.mapper.auth.status.StatusMapper;
import elbar.company.learn_center_rest.repository.auth.status.StatusRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.status.StatusValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StatusServiceImpl extends AbstractService<StatusValidator, StatusMapper, StatusRepository> implements StatusService {
    public StatusServiceImpl(StatusValidator validator, StatusMapper mapper, StatusRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(StatusCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(StatusUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Optional<Status> optional = repository.getByCode(DTO.getCode());
        if (optional.isEmpty()) {
            throw new NotFoundException("Status not found");
        }
        Status status = optional.get();
        status.setName(DTO.getName());
        status.setPublished(DTO.getIsPublished());
        status.setUpdatedAt(LocalDateTime.now());
        repository.save(status);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<Status> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Status not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<StatusGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Status not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<StatusDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Status not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<StatusGetDTO>>> list(StatusCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        Page<Status> all = repository.findAll(request);
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all.toList()), all.getSize()), HttpStatus.OK);
    }
}
