package elbar.company.learn_center_rest.validator.blog.blog_rating;

import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class BlogRatingValidator extends AbstractValidator<BlogRatingCreateDTO, BlogRatingUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlogRatingCreateDTO blogRatingCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(blogRatingCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(BlogRatingUpdateDTO blogRatingUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(blogRatingUpdateDTO)) {
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
