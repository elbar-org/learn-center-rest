package elbar.company.learn_center_rest.validator.auth.user;

import elbar.company.learn_center_rest.dto.auth.user.AuthUserCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserUpdateDTO;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;
import java.util.UUID;

@Component
public class AuthUserValidator extends AbstractValidator<AuthUserCreateDTO, AuthUserUpdateDTO, UUID> {
    @Override
    public void validOnCreate(AuthUserCreateDTO authUserCreateDTO) throws ValidationException {

    }

    @Override
    public void validOnUpdate(AuthUserUpdateDTO cd) throws ValidationException {

    }

    @Override
    public void validateKey(UUID id) throws ValidationException {

    }
}
