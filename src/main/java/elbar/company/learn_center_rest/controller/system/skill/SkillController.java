package elbar.company.learn_center_rest.controller.system.skill;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.system.level.LevelCriteria;
import elbar.company.learn_center_rest.criteria.system.skill.SkillCriteria;
import elbar.company.learn_center_rest.dto.system.level.LevelCreateDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelDetailDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelGetDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelUpdateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillCreateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillDetailDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillGetDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.system.skill.SkillServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/skill/*")
public class SkillController extends AbstractController<SkillServiceImpl> {
    public SkillController(SkillServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody SkillCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<Data<Void>> update(@RequestBody SkillUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<SkillDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<SkillGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<SkillGetDTO>>> getAll(@Valid SkillCriteria criteria) {
        return service.list(criteria);
    }
}
