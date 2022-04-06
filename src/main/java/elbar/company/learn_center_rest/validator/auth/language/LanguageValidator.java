package elbar.company.learn_center_rest.validator.auth.language;

import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class LanguageValidator extends AbstractValidator<LanguageCreateDTO, LanguageUpdateDTO, UUID> {
    @Override
    public void validOnCreate(LanguageCreateDTO languageCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(LanguageUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
