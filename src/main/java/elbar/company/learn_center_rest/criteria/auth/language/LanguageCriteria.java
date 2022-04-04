package elbar.company.learn_center_rest.criteria.auth.language;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LanguageCriteria extends GenericCriteria {
    public LanguageCriteria(Integer size, Integer page) {
        super(size, page);
    }
}
