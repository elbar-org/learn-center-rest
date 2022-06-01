package elbar.company.learn_center_rest.criteria.auth.card;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.auth.card.CardFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class CardCriteria extends GenericCriteria {
    private CardFieldsEnum fieldsEnum;
}
