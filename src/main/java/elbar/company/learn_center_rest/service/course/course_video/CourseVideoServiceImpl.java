package elbar.company.learn_center_rest.service.course.course_video;

import elbar.company.learn_center_rest.criteria.course.course_video.CourseVideoCriteria;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_video.CourseVideo;
import elbar.company.learn_center_rest.mapper.course.course_video.CourseVideoMapper;
import elbar.company.learn_center_rest.repository.course.course_video.CourseVideoRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_video.CourseVideoValidator;
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
public class CourseVideoServiceImpl extends AbstractService<CourseVideoValidator, CourseVideoMapper, CourseVideoRepository> implements CourseVideoService {
    public CourseVideoServiceImpl(CourseVideoValidator validator, CourseVideoMapper mapper, CourseVideoRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseVideoCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseVideoUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseVideo video = repository.findByCode(DTO.getCode());
        if (Objects.isNull(video)) {
            throw new NotFoundException("Course Video not found");
        }
        video.setCourseId(DTO.getCourseId());
        video.setVideo(DTO.getVideo());
        video.setTime(DTO.getTime());
        video.setPublished(DTO.getIsPublished());
        repository.save(video);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseVideo video = repository.findByCode(key);
        if (Objects.isNull(video)) {
            throw new NotFoundException("Course Video not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseVideo video = repository.findByCode(key);
        if (Objects.isNull(video)) {
            throw new NotFoundException("Course Video not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(video)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseVideo video = repository.findByCode(key);
        if (Objects.isNull(video)) {
            throw new NotFoundException("Course Video not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(video)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseVideoGetDTO>>> list(CourseVideoCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
