package elbar.company.learn_center_rest.validator.system.level;

import elbar.company.learn_center_rest.dto.system.level.LevelCreateDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class LevelValidator extends AbstractValidator<LevelCreateDTO, LevelUpdateDTO, UUID> {
    @Override
    public void validOnCreate(LevelCreateDTO levelCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(LevelUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
