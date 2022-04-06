package elbar.company.learn_center_rest.validator.auth.token;


import elbar.company.learn_center_rest.dto.auth.token.AuthTokenCreateDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AuthTokenValidator extends AbstractValidator<AuthTokenCreateDTO, AuthTokenUpdateDTO, UUID> {
    @Override
    public void validOnCreate(AuthTokenCreateDTO authTokenCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(AuthTokenUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
