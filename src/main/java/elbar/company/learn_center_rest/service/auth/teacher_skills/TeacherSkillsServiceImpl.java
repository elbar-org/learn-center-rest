package elbar.company.learn_center_rest.service.auth.teacher_skills;

import elbar.company.learn_center_rest.criteria.auth.teacher_skills.TeacherSkillsCriteria;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.teacher_skills.TeacherSkills;
import elbar.company.learn_center_rest.mapper.auth.teacher_skills.TeacherSkillsMapper;
import elbar.company.learn_center_rest.repository.auth.teacher_skills.TeacherSkillsRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.teacher_skills.TeacherSkillsValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TeacherSkillsServiceImpl extends AbstractService<TeacherSkillsValidator, TeacherSkillsMapper, TeacherSkillsRepository> implements TeacherSkillsService {
    public TeacherSkillsServiceImpl(TeacherSkillsValidator validator, TeacherSkillsMapper mapper, TeacherSkillsRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(TeacherSkillsCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(TeacherSkillsUpdateDTO DTO) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<TeacherSkills> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Teacher Skills not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TeacherSkillsGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Teacher Skills not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TeacherSkillsDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Teacher Skills not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<TeacherSkillsGetDTO>>> list(TeacherSkillsCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
