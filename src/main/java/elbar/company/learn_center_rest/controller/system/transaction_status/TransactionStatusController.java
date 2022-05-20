package elbar.company.learn_center_rest.controller.system.transaction_status;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.system.transaction_status.TransactionStatusCriteria;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusGetDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusUpdateDTO;

import java.util.UUID;

public interface TransactionStatusController extends GenericCUDController<TransactionStatusCreateDTO, TransactionStatusUpdateDTO, UUID>, GenericGLDController<TransactionStatusGetDTO, TransactionStatusDetailDTO, TransactionStatusCriteria, UUID> {
}
