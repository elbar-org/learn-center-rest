package elbar.company.learn_center_rest.service.system.level;

import elbar.company.learn_center_rest.criteria.system.level.LevelCriteria;
import elbar.company.learn_center_rest.dto.system.level.LevelCreateDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelDetailDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelGetDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelUpdateDTO;
import elbar.company.learn_center_rest.entity.system.faq.Faq;
import elbar.company.learn_center_rest.entity.system.level.Level;
import elbar.company.learn_center_rest.mapper.system.level.LevelMapper;
import elbar.company.learn_center_rest.repository.system.level.LevelRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.system.level.LevelValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class LevelServiceImpl extends AbstractService<LevelValidator, LevelMapper, LevelRepository> implements LevelService {
    public LevelServiceImpl(LevelValidator validator, LevelMapper mapper, LevelRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(LevelCreateDTO DTO) {
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(LevelUpdateDTO DTO) {
        Level level = repository.getByCode(DTO.getCode());
        level.setName(DTO.getName());
        level.setPublished(DTO.isPublished());
        level.setUpdatedAt(LocalDateTime.now());
        repository.save(level);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<LevelGetDTO>> get(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<LevelDetailDTO>> detail(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<LevelGetDTO>>> list(LevelCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        Page<Level> all = repository.findAll(request);
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all.toList()), all.getSize()), HttpStatus.OK);
    }
}
