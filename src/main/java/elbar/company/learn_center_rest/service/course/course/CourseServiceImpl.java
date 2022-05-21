package elbar.company.learn_center_rest.service.course.course;

import elbar.company.learn_center_rest.criteria.course.course.CourseCriteria;
import elbar.company.learn_center_rest.dto.course.course.CourseCreateDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseDetailDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseGetDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course.Course;
import elbar.company.learn_center_rest.mapper.course.course.CourseMapper;
import elbar.company.learn_center_rest.repository.course.course.CourseRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course.CourseValidator;
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
public class CourseServiceImpl extends AbstractService<CourseValidator, CourseMapper, CourseRepository> implements CourseService {
    public CourseServiceImpl(CourseValidator validator, CourseMapper mapper, CourseRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Course course = repository.findByCode(DTO.getCode());
        if (Objects.isNull(course)) {
            throw new NotFoundException("Course not found");
        }
        course.setTitle(DTO.getTitle());
        course.setDescription(DTO.getDescription());
        course.setImage(DTO.getImage());
        course.setContent(DTO.getContent());
        course.setCategoryId(DTO.getCategoryId());
        course.setPublished(DTO.getIsPublished());
        repository.save(course);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Course course = repository.findByCode(key);
        if (Objects.isNull(course)) {
            throw new NotFoundException("Course not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseGetDTO>> get(UUID key) {
        validator.validateKey(key);
        Course course = repository.findByCode(key);
        if (Objects.isNull(course)) {
            throw new NotFoundException("Course not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(course)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        Course course = repository.findByCode(key);
        if (Objects.isNull(course)) {
            throw new NotFoundException("Course not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(course)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseGetDTO>>> list(CourseCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
