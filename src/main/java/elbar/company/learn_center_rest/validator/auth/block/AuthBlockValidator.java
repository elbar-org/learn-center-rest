package elbar.company.learn_center_rest.validator.auth.block;

import elbar.company.learn_center_rest.dto.auth.block.AuthBlockCreateDDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class AuthBlockValidator extends AbstractValidator<AuthBlockCreateDDTO, AuthBlockUpdateDTO, UUID> {

    @Override
    public void validOnCreate(AuthBlockCreateDDTO authBlockCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(authBlockCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(AuthBlockUpdateDTO cd) throws InvalidValidationException {
        if (Objects.isNull(cd)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (Objects.isNull(id)) {
            throw new InvalidValidationException("ID is invalid");
        }
    }
}
