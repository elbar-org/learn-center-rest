package elbar.company.learn_center_rest.validator.auth.payment;

import elbar.company.learn_center_rest.dto.auth.payment.PaymentCreateDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PaymentValidator extends AbstractValidator<PaymentCreateDTO, PaymentUpdateDTO, UUID> {
    @Override
    public void validOnCreate(PaymentCreateDTO paymentCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(PaymentUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
