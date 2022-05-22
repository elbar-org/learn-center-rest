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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/transaction_status/*")
public class TransactionStatusControllerImpl extends AbstractController<TransactionStatusServiceImpl> implements TransactionStatusController{
    public TransactionStatusControllerImpl(TransactionStatusServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(TransactionStatusCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Transaction Status"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(TransactionStatusUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Transaction Status"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Transaction Status"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TransactionStatusGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<TransactionStatusDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<TransactionStatusGetDTO>>> list(TransactionStatusCriteria criteria) {
        return service.list(criteria);
    }
}
