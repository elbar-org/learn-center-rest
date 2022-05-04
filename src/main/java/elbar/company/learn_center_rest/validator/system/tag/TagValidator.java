package elbar.company.learn_center_rest.validator.system.tag;

import elbar.company.learn_center_rest.dto.system.tag.TagCreateDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TagValidator extends AbstractValidator<TagCreateDTO, TagUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TagCreateDTO tagCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(TagUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
