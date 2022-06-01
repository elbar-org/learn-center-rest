package elbar.company.learn_center_rest.service.course.course_video_source_code;

import elbar.company.learn_center_rest.criteria.course.course_video_source_code.CourseVideoSourceCodeCriteria;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_video_source_code.CourseVideoSourceCode;
import elbar.company.learn_center_rest.mapper.course.course_video_source_code.CourseVideoSourceCodeMapper;
import elbar.company.learn_center_rest.repository.course.course_video_source_code.CourseVideoSourceCodeRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_video_source_code.CourseVideoSourceCodeValidator;
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
public class CourseVideoSourceCodeServiceImpl extends AbstractService<CourseVideoSourceCodeValidator, CourseVideoSourceCodeMapper, CourseVideoSourceCodeRepository> implements CourseVideoSourceCodeService {
    public CourseVideoSourceCodeServiceImpl(CourseVideoSourceCodeValidator validator, CourseVideoSourceCodeMapper mapper, CourseVideoSourceCodeRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseVideoSourceCodeCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseVideoSourceCodeUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseVideoSourceCode sourceCode = repository.findByCode(DTO.getCode());
        if (Objects.isNull(sourceCode)) {
            throw new NotFoundException("Course Video Source Code not found");
        }
        sourceCode.setVideoId(DTO.getVideoId());
        sourceCode.setFile(DTO.getFile());
        repository.save(sourceCode);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseVideoSourceCode sourceCode = repository.findByCode(key);
        if (Objects.isNull(sourceCode)) {
            throw new NotFoundException("Course Video Source Code not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoSourceCodeGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseVideoSourceCode sourceCode = repository.findByCode(key);
        if (Objects.isNull(sourceCode)) {
            throw new NotFoundException("Course Video Source Code not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(sourceCode)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoSourceCodeDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseVideoSourceCode sourceCode = repository.findByCode(key);
        if (Objects.isNull(sourceCode)) {
            throw new NotFoundException("Course Video Source Code not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(sourceCode)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseVideoSourceCodeGetDTO>>> list(CourseVideoSourceCodeCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
