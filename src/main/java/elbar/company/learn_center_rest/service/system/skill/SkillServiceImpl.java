package elbar.company.learn_center_rest.service.system.skill;

import elbar.company.learn_center_rest.criteria.system.skill.SkillCriteria;
import elbar.company.learn_center_rest.dto.system.skill.SkillCreateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillDetailDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillGetDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillUpdateDTO;
import elbar.company.learn_center_rest.entity.system.faq.Faq;
import elbar.company.learn_center_rest.entity.system.level.Level;
import elbar.company.learn_center_rest.entity.system.skill.Skill;
import elbar.company.learn_center_rest.mapper.system.skill.SkillMapper;
import elbar.company.learn_center_rest.repository.system.skill.SkillRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.system.skill.SkillValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SkillServiceImpl extends AbstractService<SkillValidator, SkillMapper, SkillRepository> implements SkillService {
    public SkillServiceImpl(SkillValidator validator, SkillMapper mapper, SkillRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(SkillCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(SkillUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Optional<Skill> optional = repository.getByCode(DTO.getCode());
        if (optional.isEmpty()) {
            throw new NotFoundException("Skill not found");
        }
        Skill skill = optional.get();
        skill.setName(DTO.getName());
        skill.setPublished(DTO.isPublished());
        skill.setUpdatedAt(LocalDateTime.now());
        repository.save(skill);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<Skill> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Skill not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<SkillGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Skill not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<SkillDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Skill not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<SkillGetDTO>>> list(SkillCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
