package elbar.company.learn_center_rest.validator.blog.blog_category;

import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BlogCategoryValidator extends AbstractValidator<BlogCategoryCreateDTO, BlogCategoryUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlogCategoryCreateDTO blogCategoryCreateDTO) throws InvalidValidationException {
    }

    @Override
    public void validOnUpdate(BlogCategoryUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
