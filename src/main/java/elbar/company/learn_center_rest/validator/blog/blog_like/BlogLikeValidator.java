package elbar.company.learn_center_rest.validator.blog.blog_like;

import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BlogLikeValidator extends AbstractValidator<BlogLikeCreateDTO, BlogLikeUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlogLikeCreateDTO blogLikeCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(BlogLikeUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
