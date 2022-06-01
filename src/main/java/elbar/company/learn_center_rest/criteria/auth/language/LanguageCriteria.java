package elbar.company.learn_center_rest.criteria.auth.language;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.auth.language.LanguageFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class LanguageCriteria extends GenericCriteria {
    private LanguageFieldsEnum fieldsEnum;
}
