package elbar.company.learn_center_rest.service.blog.blog_tag;

import elbar.company.learn_center_rest.criteria.blog.blog_tag.BlogTagCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface BlogTagService extends GenericCUDService<BlogTagCreateDTO, BlogTagUpdateDTO, UUID>, GenericGLDService<BlogTagGetDTO, BlogTagDetailDTO, BlogTagCriteria, UUID> {
}
