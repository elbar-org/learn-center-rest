package elbar.company.learn_center_rest.service.auth.teacher;

import elbar.company.learn_center_rest.criteria.auth.teacher.TeacherCriteria;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.teacher.Teacher;
import elbar.company.learn_center_rest.mapper.auth.teacher.TeacherMapper;
import elbar.company.learn_center_rest.repository.auth.teacher.TeacherRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.teacher.TeacherValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class TeacherServiceImpl extends AbstractService<TeacherValidator, TeacherMapper, TeacherRepository> implements TeacherService {
    public TeacherServiceImpl(TeacherValidator validator, TeacherMapper mapper, TeacherRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(TeacherCreateDTO DTO) {
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(TeacherUpdateDTO DTO) {
        Teacher teacher = repository.getByCode(DTO.getCode());
        teacher.setAbout(DTO.getAbout());
        teacher.setUpdatedAt(LocalDateTime.now());
        teacher.setAge(DTO.getAge());
        teacher.setExperience(DTO.getExperience());
        repository.save(teacher);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TeacherGetDTO>> get(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TeacherDetailDTO>> detail(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<TeacherGetDTO>>> list(TeacherCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        Page<Teacher> all = repository.findAll(request);
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all.toList()), all.getSize()), HttpStatus.OK);
    }
}
