package elbar.company.learn_center_rest.validator.auth.user_role;

import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserRoleValidator extends AbstractValidator<UserRoleCreateDTO, UserRoleUpdateDTO, UUID> {
    @Override
    public void validOnCreate(UserRoleCreateDTO userRoleCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(UserRoleUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
