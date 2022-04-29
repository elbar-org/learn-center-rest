package elbar.company.learn_center_rest.criteria.auth.teacher_skills;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class TeacherSkillsCriteria extends GenericCriteria {
    public TeacherSkillsCriteria(Integer size, Integer page, Sort.Direction sort) {
        super(size, page, sort);
    }
}
