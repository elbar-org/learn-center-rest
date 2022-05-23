package elbar.company.learn_center_rest.service.course.course_like;

import elbar.company.learn_center_rest.criteria.course.course_like.CourseLikeCriteria;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_like.CourseLike;
import elbar.company.learn_center_rest.mapper.course.course_like.CourseLikeMapper;
import elbar.company.learn_center_rest.repository.course.course_like.CourseLikeRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_like.CourseLikeValidator;
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
public class CourseLikeServiceImpl extends AbstractService<CourseLikeValidator, CourseLikeMapper, CourseLikeRepository> implements CourseLikeService {
    public CourseLikeServiceImpl(CourseLikeValidator validator, CourseLikeMapper mapper, CourseLikeRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseLikeCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseLikeUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseLike like = repository.findByCode(DTO.getCode());
        if (Objects.isNull(like)) {
            throw new NotFoundException("Course like not found");
        }
        like.setCourseId(DTO.getCourseId());
        like.setUserId(DTO.getUserId());
        repository.save(like);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseLike like = repository.findByCode(key);
        if (Objects.isNull(like)) {
            throw new NotFoundException("Course like not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseLikeGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseLike like = repository.findByCode(key);
        if (Objects.isNull(like)) {
            throw new NotFoundException("Course like not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(like)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseLikeDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseLike like = repository.findByCode(key);
        if (Objects.isNull(like)) {
            throw new NotFoundException("Course like not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(like)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseLikeGetDTO>>> list(CourseLikeCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
