package elbar.company.learn_center_rest.criteria.system.skill;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.system.skill.SkillFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class SkillCriteria extends GenericCriteria {
    private SkillFieldsEnum fieldsEnum;
}
