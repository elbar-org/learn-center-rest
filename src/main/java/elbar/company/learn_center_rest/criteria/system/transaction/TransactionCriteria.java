package elbar.company.learn_center_rest.criteria.system.transaction;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.system.transaction.TransactionFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;

@Getter
@Setter
@ParameterObject
public class TransactionCriteria extends GenericCriteria {
    private TransactionFieldsEnum fieldsEnum;
}
