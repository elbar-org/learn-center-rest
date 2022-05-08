package elbar.company.learn_center_rest.service.blog.blog;

import elbar.company.learn_center_rest.criteria.blog.blog.BlogCriteria;
import elbar.company.learn_center_rest.dto.blog.blog.BlogCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog.BlogDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog.BlogGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog.BlogUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface BlogService extends GenericCUDService<BlogCreateDTO, BlogUpdateDTO, UUID>, GenericGLDService<BlogGetDTO, BlogDetailDTO, BlogCriteria, UUID> {
}
