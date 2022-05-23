package elbar.company.learn_center_rest.service.course.course_rating;

import elbar.company.learn_center_rest.criteria.course.course_rating.CourseRatingCriteria;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingGetDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_rating.CourseRating;
import elbar.company.learn_center_rest.mapper.course.course_rating.CourseRatingMapper;
import elbar.company.learn_center_rest.repository.course.course_rating.CourseRatingRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_rating.CourseRatingValidator;
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
public class CourseRatingServiceImpl extends AbstractService<CourseRatingValidator, CourseRatingMapper, CourseRatingRepository> implements CourseRatingService {
    public CourseRatingServiceImpl(CourseRatingValidator validator, CourseRatingMapper mapper, CourseRatingRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseRatingCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseRatingUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseRating rating = repository.findByCode(DTO.getCode());
        if (Objects.isNull(rating)) {
            throw new NotFoundException("Course rating not found");
        }
        rating.setViews(DTO.getViews());
        rating.setStars(DTO.getStars());
        rating.setBuyers(DTO.getBuyers());
        repository.save(rating);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseRating rating = repository.findByCode(key);
        if (Objects.isNull(rating)) {
            throw new NotFoundException("Course rating not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseRatingGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseRating rating = repository.findByCode(key);
        if (Objects.isNull(rating)) {
            throw new NotFoundException("Course rating not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(rating)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseRatingDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseRating rating = repository.findByCode(key);
        if (Objects.isNull(rating)) {
            throw new NotFoundException("Course rating not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(rating)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseRatingGetDTO>>> list(CourseRatingCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
