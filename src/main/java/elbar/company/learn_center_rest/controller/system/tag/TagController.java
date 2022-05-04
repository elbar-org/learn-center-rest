package elbar.company.learn_center_rest.controller.system.tag;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.system.skill.SkillCriteria;
import elbar.company.learn_center_rest.criteria.system.tag.TagCriteria;
import elbar.company.learn_center_rest.dto.system.skill.SkillCreateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillDetailDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillGetDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillUpdateDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagCreateDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagDetailDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagGetDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.system.tag.TagServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/tag/*")
public class TagController extends AbstractController<TagServiceImpl> {
    public TagController(TagServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody TagCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<Data<Void>> update(@RequestBody TagUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TagDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TagGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<TagGetDTO>>> getAll(@Valid TagCriteria criteria) {
        return service.list(criteria);
    }
}
