package elbar.company.learn_center_rest.validator.system.transaction_status;

import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class TransactionStatusValidator extends AbstractValidator<TransactionStatusCreateDTO, TransactionStatusUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TransactionStatusCreateDTO transactionStatusCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(transactionStatusCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(TransactionStatusUpdateDTO cd) throws InvalidValidationException {
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
