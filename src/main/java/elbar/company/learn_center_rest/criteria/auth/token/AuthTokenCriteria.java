package elbar.company.learn_center_rest.criteria.auth.token;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class AuthTokenCriteria extends GenericCriteria {
    public AuthTokenCriteria(Integer size, Integer page, Sort.Direction sort) {
        super(size, page, sort);
    }
}
