package elbar.company.learn_center_rest.validator.system.transaction;

import elbar.company.learn_center_rest.dto.system.transaction.TransactionCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TransactionValidator extends AbstractValidator<TransactionCreateDTO, TransactionUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TransactionCreateDTO transactionCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(TransactionUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
