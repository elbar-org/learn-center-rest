package elbar.company.learn_center_rest.service.course.course_price;

import elbar.company.learn_center_rest.criteria.course.course_price.CoursePriceCriteria;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceGetDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_price.CoursePrice;
import elbar.company.learn_center_rest.mapper.course.course_price.CoursePriceMapper;
import elbar.company.learn_center_rest.repository.course.course_price.CoursePriceRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_price.CoursePriceValidator;
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
public class CoursePriceServiceImpl extends AbstractService<CoursePriceValidator, CoursePriceMapper, CoursePriceRepository> implements CoursePriceService {
    public CoursePriceServiceImpl(CoursePriceValidator validator, CoursePriceMapper mapper, CoursePriceRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CoursePriceCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CoursePriceUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CoursePrice price = repository.findByCode(DTO.getCode());
        if (Objects.isNull(price)) {
            throw new NotFoundException("Course price not found");
        }
        price.setCourseId(DTO.getCourseId());
        price.setPrice(DTO.getPrice());
        price.setDiscount(DTO.getDiscount());
        repository.save(price);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CoursePrice price = repository.findByCode(key);
        if (Objects.isNull(price)) {
            throw new NotFoundException("Course price not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CoursePriceGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CoursePrice price = repository.findByCode(key);
        if (Objects.isNull(price)) {
            throw new NotFoundException("Course price not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(price)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CoursePriceDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CoursePrice price = repository.findByCode(key);
        if (Objects.isNull(price)) {
            throw new NotFoundException("Course price not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(price)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CoursePriceGetDTO>>> list(CoursePriceCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
