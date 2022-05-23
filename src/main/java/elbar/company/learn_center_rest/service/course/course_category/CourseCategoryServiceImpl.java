package elbar.company.learn_center_rest.service.course.course_category;

import elbar.company.learn_center_rest.criteria.course.course_category.CourseCategoryCriteria;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryGetDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_category.CourseCategory;
import elbar.company.learn_center_rest.mapper.course.course_category.CourseCategoryMapper;
import elbar.company.learn_center_rest.repository.course.course_category.CourseCategoryRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_category.CourseCategoryValidator;
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
public class CourseCategoryServiceImpl extends AbstractService<CourseCategoryValidator, CourseCategoryMapper, CourseCategoryRepository> implements CourseCategoryService {
    public CourseCategoryServiceImpl(CourseCategoryValidator validator, CourseCategoryMapper mapper, CourseCategoryRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseCategoryCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseCategoryUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseCategory category = repository.findByCode(DTO.getCode());
        if (Objects.isNull(category)) {
            throw new NotFoundException("Course category not found");
        }
        category.setTitle(DTO.getTitle());
        category.setDescription(DTO.getDescription());
        category.setPublished(DTO.getIsPublished());
        repository.save(category);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseCategory category = repository.findByCode(key);
        if (Objects.isNull(category)) {
            throw new NotFoundException("Course category not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseCategoryGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseCategory category = repository.findByCode(key);
        if (Objects.isNull(category)) {
            throw new NotFoundException("Course category not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(category)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseCategoryDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseCategory category = repository.findByCode(key);
        if (Objects.isNull(category)) {
            throw new NotFoundException("Course category not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(category)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseCategoryGetDTO>>> list(CourseCategoryCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
