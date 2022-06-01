package elbar.company.learn_center_rest.service.course.course_video_materials;

import elbar.company.learn_center_rest.criteria.course.course_video_materials.CourseVideoMaterialsCriteria;
import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_video_materials.CourseVideoMaterials;
import elbar.company.learn_center_rest.mapper.course.course_video_materials.CourseVideoMaterialsMapper;
import elbar.company.learn_center_rest.repository.course.course_video_materials.CourseVideoMaterialsRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_video_materials.CourseVideoMaterialsValidator;
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
public class CourseVideoMaterialsServiceImpl extends AbstractService<CourseVideoMaterialsValidator, CourseVideoMaterialsMapper, CourseVideoMaterialsRepository> implements CourseVideoMaterialsService {
    public CourseVideoMaterialsServiceImpl(CourseVideoMaterialsValidator validator, CourseVideoMaterialsMapper mapper, CourseVideoMaterialsRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseVideoMaterialsCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseVideoMaterialsUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseVideoMaterials materials = repository.findByCode(DTO.getCode());
        if (Objects.isNull(materials)) {
            throw new NotFoundException("Course Video Materials not found");
        }
        materials.setVideoId(DTO.getVideoId());
        materials.setFile(DTO.getFile());
        repository.save(materials);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseVideoMaterials materials = repository.findByCode(key);
        if (Objects.isNull(materials)) {
            throw new NotFoundException("Course Video Materials not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoMaterialsGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseVideoMaterials materials = repository.findByCode(key);
        if (Objects.isNull(materials)) {
            throw new NotFoundException("Course Video Materials not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(materials)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoMaterialsDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseVideoMaterials materials = repository.findByCode(key);
        if (Objects.isNull(materials)) {
            throw new NotFoundException("Course Video Materials not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(materials)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseVideoMaterialsGetDTO>>> list(CourseVideoMaterialsCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
