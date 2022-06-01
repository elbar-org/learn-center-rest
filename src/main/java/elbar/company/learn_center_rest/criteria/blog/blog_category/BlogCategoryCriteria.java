package elbar.company.learn_center_rest.criteria.blog.blog_category;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.blog.blog_category.BlogCategoryFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class BlogCategoryCriteria extends GenericCriteria {
    private BlogCategoryFieldsEnum fieldsEnum;
}
