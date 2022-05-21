package elbar.company.learn_center_rest.controller.blog.blog_comment;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.blog.blog_comment.BlogCommentCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentUpdateDTO;

import java.util.UUID;

public interface BlogCommentController extends GenericCUDController<BlogCommentCreateDTO, BlogCommentUpdateDTO, UUID>, GenericGLDController<BlogCommentGetDTO, BlogCommentDetailDTO, BlogCommentCriteria, UUID> {
}
