package elbar.company.learn_center_rest.validator.blog.blog_comment;

import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BlogCommentValidator extends AbstractValidator<BlogCommentCreateDTO, BlogCommentUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlogCommentCreateDTO blogCommentCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(BlogCommentUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
