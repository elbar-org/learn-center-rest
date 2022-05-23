package elbar.company.learn_center_rest.validator.system.faq;

import elbar.company.learn_center_rest.dto.system.faq.FaqCreateDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class FaqValidator extends AbstractValidator<FaqCreateDTO, FaqUpdateDTO, UUID> {
    @Override
    public void validOnCreate(FaqCreateDTO faqCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(faqCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(FaqUpdateDTO cd) throws InvalidValidationException {
        if (Objects.isNull(cd)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (Objects.isNull(id)) {
            throw new InvalidValidationException("ID is null");
        }
    }
}
