package elbar.company.learn_center_rest.validator.blog.blog;

import elbar.company.learn_center_rest.dto.blog.blog.BlogCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog.BlogUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BlogValidator extends AbstractValidator<BlogCreateDTO, BlogUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlogCreateDTO blogCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(BlogUpdateDTO blogUpdateDTO) throws InvalidValidationException {

    }


    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (id == null && id.toString().length() != 16) {
            throw new InvalidValidationException();
        }
    }
}
