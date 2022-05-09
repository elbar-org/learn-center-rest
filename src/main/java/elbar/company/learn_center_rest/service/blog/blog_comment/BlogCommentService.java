package elbar.company.learn_center_rest.service.blog.blog_comment;

import elbar.company.learn_center_rest.criteria.blog.blog_comment.BlogCommentCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface BlogCommentService extends GenericCUDService<BlogCommentCreateDTO, BlogCommentUpdateDTO, UUID>, GenericGLDService<BlogCommentGetDTO, BlogCommentDetailDTO, BlogCommentCriteria, UUID> {
}
