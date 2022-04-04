package elbar.company.learn_center_rest.controller.blog.blog_category;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.service.blog.blog_category.BlogCategoryServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/blog-category/*")
public class BlogCategoryController extends AbstractController<BlogCategoryServiceImpl> {
    public BlogCategoryController(BlogCategoryServiceImpl service) {
        super(service);
    }
}
