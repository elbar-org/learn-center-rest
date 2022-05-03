package elbar.company.learn_center_rest.controller.system.level;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.system.faq.FaqCriteria;
import elbar.company.learn_center_rest.criteria.system.level.LevelCriteria;
import elbar.company.learn_center_rest.dto.system.faq.FaqCreateDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqDetailDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqGetDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqUpdateDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelCreateDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelDetailDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelGetDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.system.level.LevelServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/level/*")
public class LevelController extends AbstractController<LevelServiceImpl> {
    public LevelController(LevelServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody LevelCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<Data<Void>> update(@RequestBody LevelUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<LevelDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<LevelGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<LevelGetDTO>>> getAll(@Valid LevelCriteria criteria) {
        return service.list(criteria);
    }
}
