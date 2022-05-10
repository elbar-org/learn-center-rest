package elbar.company.learn_center_rest.validator;

import elbar.company.learn_center_rest.dto.BaseDTO;
import elbar.company.learn_center_rest.dto.GenericDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;

import javax.xml.bind.ValidationException;
import java.io.Serializable;

public abstract class AbstractValidator<CD extends BaseDTO, UD extends GenericDTO, K extends Serializable> implements BaseValidator {
    public abstract void validOnCreate(CD cd) throws InvalidValidationException;

    public abstract void validOnUpdate(UD ud) throws InvalidValidationException;

    public abstract void validateKey(K id) throws InvalidValidationException;
}
