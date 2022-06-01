package elbar.company.learn_center_rest.criteria.system.transaction_status;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.system.transaction.TransactionFieldsEnum;
import elbar.company.learn_center_rest.enums.system.transaction_status.TransactionStatusFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class TransactionStatusCriteria extends GenericCriteria {
    private TransactionStatusFieldsEnum fieldsEnum;
}
