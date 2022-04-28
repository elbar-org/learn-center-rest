package elbar.company.learn_center_rest.validator.auth.block_reason;

import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonCreateDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BlockReasonValidator extends AbstractValidator<BlockReasonCreateDTO, BlockReasonUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlockReasonCreateDTO blockReasonCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(BlockReasonUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
