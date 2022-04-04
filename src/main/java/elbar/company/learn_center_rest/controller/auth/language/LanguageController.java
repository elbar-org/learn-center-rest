package elbar.company.learn_center_rest.controller.auth.language;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.language.LanguageCriteria;
import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageDetailDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageGetDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.language.LanguageServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/language/*")
public class LanguageController extends AbstractController<LanguageServiceImpl> {

    public LanguageController(LanguageServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody LanguageCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<Data<Void>> update(@RequestBody LanguageUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<LanguageDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<LanguageGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<LanguageGetDTO>>> getAll(@Valid LanguageCriteria criteria) {
        return service.list(criteria);
    }
}
