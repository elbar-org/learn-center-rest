package elbar.company.learn_center_rest.validator.auth.block;

import elbar.company.learn_center_rest.dto.auth.block.AuthBlockCreateDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AuthBlockValidator extends AbstractValidator<AuthBlockCreateDTO, AuthBlockUpdateDTO, UUID> {
    @Override
    public void validOnCreate(AuthBlockCreateDTO authBlockCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(AuthBlockUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
