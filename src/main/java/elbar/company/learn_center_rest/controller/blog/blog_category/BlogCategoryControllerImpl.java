package elbar.company.learn_center_rest.controller.blog.blog_category;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.criteria.blog.blog_category.BlogCategoryCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.blog.blog_category.BlogCategoryServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Order;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/blog-category/*")
public class BlogCategoryControllerImpl extends AbstractController<BlogCategoryServiceImpl> implements BlogCategoryController {
    public BlogCategoryControllerImpl(BlogCategoryServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(BlogCategoryCreateDTO DTO) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> update(BlogCategoryUpdateDTO DTO) {
        return null;
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        return null;
    }

    @Override
    public ResponseEntity<Data<BlogCategoryGetDTO>> get(UUID code) {
        return null;
    }

    @Override
    public ResponseEntity<Data<BlogCategoryDetailDTO>> detail(UUID code) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<BlogCategoryGetDTO>>> list(BlogCategoryCriteria criteria) {
        return null;
    }
}
