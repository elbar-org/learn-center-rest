package elbar.company.learn_center_rest.service.course.course_tag;

import elbar.company.learn_center_rest.criteria.course.course_tag.CourseTagCriteria;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagGetDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_tag.CourseTag;
import elbar.company.learn_center_rest.mapper.course.course_tag.CourseTagMapper;
import elbar.company.learn_center_rest.repository.course.course_tag.CourseTagRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_tag.CourseTagValidator;
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
public class CourseTagServiceImpl extends AbstractService<CourseTagValidator, CourseTagMapper, CourseTagRepository> implements CourseTagService {
    public CourseTagServiceImpl(CourseTagValidator validator, CourseTagMapper mapper, CourseTagRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseTagCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseTagUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseTag tag = repository.findByCode(DTO.getCode());
        if (Objects.isNull(tag)) {
            throw new NotFoundException("Course tag not found");
        }
        tag.setCourseId(DTO.getCourseId());
        tag.setTagId(DTO.getTagId());
        repository.save(tag);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseTag tag = repository.findByCode(key);
        if (Objects.isNull(tag)) {
            throw new NotFoundException("Course tag not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseTagGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseTag tag = repository.findByCode(key);
        if (Objects.isNull(tag)) {
            throw new NotFoundException("Course tag not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(tag)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseTagDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseTag tag = repository.findByCode(key);
        if (Objects.isNull(tag)) {
            throw new NotFoundException("Course tag not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(tag)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseTagGetDTO>>> list(CourseTagCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
