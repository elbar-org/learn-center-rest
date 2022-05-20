package elbar.company.learn_center_rest.controller.system.skill;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.system.skill.SkillCriteria;
import elbar.company.learn_center_rest.dto.system.skill.SkillCreateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillDetailDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillGetDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.system.skill.SkillServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/skill/*")
public class SkillControllerImpl extends AbstractController<SkillServiceImpl> implements SkillController {
    public SkillControllerImpl(SkillServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(SkillCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Skill"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(SkillUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Skill"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Skill"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<SkillGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<SkillDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<SkillGetDTO>>> list(SkillCriteria criteria) {
        return service.list(criteria);
    }
}
