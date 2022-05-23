package elbar.company.learn_center_rest.service.course.course_level;

import elbar.company.learn_center_rest.criteria.course.course_level.CourseLevelCriteria;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelGetDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_level.CourseLevel;
import elbar.company.learn_center_rest.mapper.course.course_level.CourseLevelMapper;
import elbar.company.learn_center_rest.repository.course.course_level.CourseLevelRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_level.CourseLevelValidator;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@Transactional
public class CourseLevelServiceImpl extends AbstractService<CourseLevelValidator, CourseLevelMapper, CourseLevelRepository> implements CourseLevelService {
    public CourseLevelServiceImpl(CourseLevelValidator validator, CourseLevelMapper mapper, CourseLevelRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseLevelCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseLevelUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseLevel level = repository.findByCode(DTO.getCode());
        if (Objects.isNull(level)) {
            throw new NotFoundException("Course level not found");
        }
        level.setCourseId(DTO.getCourseId());
        level.setLevelId(DTO.getLevelId());
        repository.save(level);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseLevel level = repository.findByCode(key);
        if (Objects.isNull(level)) {
            throw new NotFoundException("Course level not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseLevelGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseLevel level = repository.findByCode(key);
        if (Objects.isNull(level)) {
            throw new NotFoundException("Course level not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(level)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseLevelDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseLevel level = repository.findByCode(key);
        if (Objects.isNull(level)) {
            throw new NotFoundException("Course level not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(level)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseLevelGetDTO>>> list(CourseLevelCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
