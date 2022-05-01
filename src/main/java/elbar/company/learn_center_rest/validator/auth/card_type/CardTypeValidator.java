package elbar.company.learn_center_rest.validator.auth.card_type;

import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CardTypeValidator extends AbstractValidator<CardTypeCreateDTO, CardTypeUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CardTypeCreateDTO cardTypeCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(CardTypeUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
