package elbar.company.learn_center_rest.criteria.system.level;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.system.level.LevelFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class LevelCriteria extends GenericCriteria {
    private LevelFieldsEnum fieldsEnum;
}
