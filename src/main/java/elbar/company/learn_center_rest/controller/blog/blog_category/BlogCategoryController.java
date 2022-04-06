package elbar.company.learn_center_rest.controller.blog.blog_category;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.blog.blog_category.BlogCategoryCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryUpdateDTO;

import java.util.UUID;

public interface BlogCategoryController extends GenericCUDController<BlogCategoryCreateDTO, BlogCategoryUpdateDTO, UUID>, GenericGLDController<BlogCategoryGetDTO, BlogCategoryDetailDTO, BlogCategoryCriteria, UUID> {
}
