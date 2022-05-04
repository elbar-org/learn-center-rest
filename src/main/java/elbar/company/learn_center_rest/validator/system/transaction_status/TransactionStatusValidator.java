package elbar.company.learn_center_rest.validator.system.transaction_status;

import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TransactionStatusValidator extends AbstractValidator<TransactionStatusCreateDTO, TransactionStatusUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TransactionStatusCreateDTO transactionStatusCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(TransactionStatusUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
