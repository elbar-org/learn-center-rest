package elbar.company.learn_center_rest.controller.system.transaction_status;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.system.transaction_status.TransactionStatusCriteria;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusGetDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.system.transaction_status.TransactionStatusServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/transaction_status/*")
public class TransactionStatusController extends AbstractController<TransactionStatusServiceImpl> {
    public TransactionStatusController(TransactionStatusServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody TransactionStatusCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<Data<Void>> update(@RequestBody TransactionStatusUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TransactionStatusDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<TransactionStatusGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<TransactionStatusGetDTO>>> getAll(@Valid TransactionStatusCriteria criteria) {
        return service.list(criteria);
    }
}
