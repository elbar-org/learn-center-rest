package elbar.company.learn_center_rest.criteria.auth.block_reason;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.auth.block_reason.BlockReasonFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class BlockReasonCriteria extends GenericCriteria {
    private BlockReasonFieldsEnum fieldsEnum;
}
