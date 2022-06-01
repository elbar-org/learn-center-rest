package elbar.company.learn_center_rest.validator.auth.role;

import elbar.company.learn_center_rest.dto.auth.role.RoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class RoleValidator extends AbstractValidator<RoleCreateDTO, RoleUpdateDTO, UUID> {
    @Override
    public void validOnCreate(RoleCreateDTO roleCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(roleCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(RoleUpdateDTO cd) throws InvalidValidationException {
        if (Objects.isNull(cd)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (Objects.isNull(id)) {
            throw new InvalidValidationException("ID is null");
        }
    }
}
