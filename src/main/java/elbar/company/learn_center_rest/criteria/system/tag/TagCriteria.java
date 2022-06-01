package elbar.company.learn_center_rest.criteria.system.tag;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.system.tag.TagFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class TagCriteria extends GenericCriteria {
    private TagFieldsEnum fieldsEnum;
}
