package elbar.company.learn_center_rest.service.system.transaction_status;

import elbar.company.learn_center_rest.criteria.system.transaction.TransactionCriteria;
import elbar.company.learn_center_rest.criteria.system.transaction_status.TransactionStatusCriteria;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusGetDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface TransactionStatusService extends GenericCUDService<TransactionStatusCreateDTO, TransactionStatusUpdateDTO, UUID>, GenericGLDService<TransactionStatusGetDTO, TransactionStatusDetailDTO, TransactionStatusCriteria, UUID> {
}
