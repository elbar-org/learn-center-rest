package elbar.company.learn_center_rest.service.blog.blog_like;

import elbar.company.learn_center_rest.criteria.blog.blog_like.BlogLikeCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface BlogLikeService extends GenericCUDService<BlogLikeCreateDTO, BlogLikeUpdateDTO, UUID>, GenericGLDService<BlogLikeGetDTO, BlogLikeDetailDTO, BlogLikeCriteria, UUID> {
}
