package elbar.company.learn_center_rest.validator.auth.card;

import elbar.company.learn_center_rest.dto.auth.card.CardCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CardValidator extends AbstractValidator<CardCreateDTO, CardUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CardCreateDTO cardCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(CardUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
