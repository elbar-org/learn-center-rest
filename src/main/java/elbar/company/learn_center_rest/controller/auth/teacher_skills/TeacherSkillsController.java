package elbar.company.learn_center_rest.controller.auth.teacher_skills;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.teacher_skills.TeacherSkillsCriteria;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.teacher_skills.TeacherSkillsServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/teacher_skills/*")
public class TeacherSkillsController extends AbstractController<TeacherSkillsServiceImpl> {

    public TeacherSkillsController(TeacherSkillsServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody TeacherSkillsCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TeacherSkillsDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TeacherSkillsGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<TeacherSkillsGetDTO>>> getAll(@Valid TeacherSkillsCriteria criteria) {
        return service.list(criteria);
    }
}
