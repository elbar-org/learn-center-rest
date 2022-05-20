package elbar.company.learn_center_rest.controller.blog.blog;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.blog.blog.BlogCriteria;
import elbar.company.learn_center_rest.dto.blog.blog.BlogCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog.BlogDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog.BlogGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog.BlogUpdateDTO;

import java.util.UUID;

public interface BlogController extends GenericCUDController<BlogCreateDTO, BlogUpdateDTO, UUID>, GenericGLDController<BlogGetDTO, BlogDetailDTO, BlogCriteria, UUID> {
}
