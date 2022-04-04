package elbar.company.learn_center_rest.service.blog.blog_category;

import elbar.company.learn_center_rest.criteria.blog.blog_category.BlogCategoryCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface BlogCategoryService extends GenericCUDService<BlogCategoryCreateDTO, BlogCategoryUpdateDTO, UUID>, GenericGLDService<BlogCategoryGetDTO, BlogCategoryDetailDTO, BlogCategoryCriteria, UUID> {
}
