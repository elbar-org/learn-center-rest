package elbar.company.learn_center_rest.validator.auth.role;

import elbar.company.learn_center_rest.dto.auth.role.RoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RoleValidator extends AbstractValidator<RoleCreateDTO, RoleUpdateDTO, UUID> {
    @Override
    public void validOnCreate(RoleCreateDTO roleCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(RoleUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
