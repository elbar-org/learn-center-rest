package elbar.company.learn_center_rest.validator.auth.status;

import elbar.company.learn_center_rest.dto.auth.status.StatusCreateDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class StatusValidator extends AbstractValidator<StatusCreateDTO, StatusUpdateDTO, UUID> {
    @Override
    public void validOnCreate(StatusCreateDTO statusCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(StatusUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
