package elbar.company.learn_center_rest.validator.auth.status;

import elbar.company.learn_center_rest.dto.auth.status.StatusCreateDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusUpdateDTO;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;
import java.util.UUID;

@Component
public class StatusValidator extends AbstractValidator<StatusCreateDTO, StatusUpdateDTO, UUID> {
    @Override
    public void validOnCreate(StatusCreateDTO statusCreateDTO) throws ValidationException {

    }

    @Override
    public void validOnUpdate(StatusUpdateDTO cd) throws ValidationException {

    }

    @Override
    public void validateKey(UUID id) throws ValidationException {

    }
}
