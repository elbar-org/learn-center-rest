package elbar.company.learn_center_rest.criteria.auth.status;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusCriteria extends GenericCriteria {
    public StatusCriteria(Integer size, Integer page) {
        super(size, page);
    }
}
