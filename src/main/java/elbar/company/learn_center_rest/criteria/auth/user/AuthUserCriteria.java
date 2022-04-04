package elbar.company.learn_center_rest.criteria.auth.user;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthUserCriteria extends GenericCriteria {
    public AuthUserCriteria(Integer size, Integer page) {
        super(size, page);
    }
}
