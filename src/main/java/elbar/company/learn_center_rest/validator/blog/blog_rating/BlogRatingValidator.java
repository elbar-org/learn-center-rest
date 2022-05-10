package elbar.company.learn_center_rest.validator.blog.blog_rating;

import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BlogRatingValidator extends AbstractValidator<BlogRatingCreateDTO, BlogRatingUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlogRatingCreateDTO blogRatingCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(BlogRatingUpdateDTO blogRatingUpdateDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
