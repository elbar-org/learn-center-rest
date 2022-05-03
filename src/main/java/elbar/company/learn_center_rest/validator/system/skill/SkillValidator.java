package elbar.company.learn_center_rest.validator.system.skill;

import elbar.company.learn_center_rest.dto.system.skill.SkillCreateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SkillValidator extends AbstractValidator<SkillCreateDTO, SkillUpdateDTO, UUID> {
    @Override
    public void validOnCreate(SkillCreateDTO skillCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(SkillUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
