package elbar.company.learn_center_rest.validator.auth.language;

import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;
import java.util.UUID;

@Component
public class LanguageValidator extends AbstractValidator<LanguageCreateDTO, LanguageUpdateDTO, UUID> {
    @Override
    public void validOnCreate(LanguageCreateDTO languageCreateDTO) throws ValidationException {

    }

    @Override
    public void validOnUpdate(LanguageUpdateDTO cd) throws ValidationException {

    }

    @Override
    public void validateKey(UUID id) throws ValidationException {

    }
}
