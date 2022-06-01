package elbar.company.learn_center_rest.criteria.auth.card_type;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.auth.card_type.CardTypeFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class CardTypeCriteria extends GenericCriteria {
    private CardTypeFieldsEnum fieldsEnum;
}
