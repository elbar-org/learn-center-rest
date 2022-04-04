package elbar.company.learn_center_rest.service.auth.status;

import elbar.company.learn_center_rest.criteria.auth.status.StatusCriteria;
import elbar.company.learn_center_rest.dto.auth.status.StatusCreateDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusDetailDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusGetDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.language.Language;
import elbar.company.learn_center_rest.entity.auth.status.Status;
import elbar.company.learn_center_rest.mapper.auth.status.StatusMapper;
import elbar.company.learn_center_rest.repository.auth.status.StatusRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class StatusServiceImpl extends AbstractService<StatusMapper, StatusRepository> implements StatusService {

    public StatusServiceImpl(StatusMapper mapper, StatusRepository repository) {
        super(mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(StatusCreateDTO DTO) {
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(StatusUpdateDTO DTO) {
        Status status = repository.getByCode(DTO.getCode());
        status.setName(DTO.getName());
        status.setPublished(DTO.getIsPublished());
        status.setUpdatedAt(LocalDateTime.now());
        repository.save(status);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<StatusGetDTO>> get(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<StatusDetailDTO>> detail(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<StatusGetDTO>>> list() {
        return null;
    }

    public ResponseEntity<Data<List<StatusGetDTO>>> list(StatusCriteria criteria) {
        return null;
    }
}
