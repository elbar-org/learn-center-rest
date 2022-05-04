package elbar.company.learn_center_rest.service.system.transaction;

import elbar.company.learn_center_rest.criteria.system.transaction.TransactionCriteria;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionGetDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface TransactionService extends GenericCUDService<TransactionCreateDTO, TransactionUpdateDTO, UUID>, GenericGLDService<TransactionGetDTO, TransactionDetailDTO, TransactionCriteria, UUID> {
}
