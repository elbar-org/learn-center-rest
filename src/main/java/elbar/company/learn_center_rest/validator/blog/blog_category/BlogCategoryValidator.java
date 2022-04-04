package elbar.company.learn_center_rest.validator.blog.blog_category;

import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryUpdateDTO;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;
import java.util.UUID;

@Component
public class BlogCategoryValidator extends AbstractValidator<BlogCategoryCreateDTO, BlogCategoryUpdateDTO, UUID> {
    @Override
    public void validOnCreate(BlogCategoryCreateDTO blogCategoryCreateDTO) throws ValidationException {

    }

    @Override
    public void validOnUpdate(BlogCategoryUpdateDTO cd) throws ValidationException {

    }

    @Override
    public void validateKey(UUID id) throws ValidationException {

    }
}
