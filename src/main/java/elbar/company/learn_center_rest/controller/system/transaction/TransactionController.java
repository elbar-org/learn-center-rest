package elbar.company.learn_center_rest.controller.system.transaction;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.system.tag.TagCriteria;
import elbar.company.learn_center_rest.criteria.system.transaction.TransactionCriteria;
import elbar.company.learn_center_rest.dto.system.tag.TagCreateDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagDetailDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagGetDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagUpdateDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionGetDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.system.transaction.TransactionServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/transaction/*")
public class TransactionController extends AbstractController<TransactionServiceImpl> {
    public TransactionController(TransactionServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody TransactionCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TransactionDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TransactionGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<TransactionGetDTO>>> getAll(@Valid TransactionCriteria criteria) {
        return service.list(criteria);
    }
}
