package elbar.company.learn_center_rest.mapper.blog.blog_comment;

import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentUpdateDTO;
import elbar.company.learn_center_rest.entity.blog.blog_comment.BlogComment;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BlogCommentMapper extends GenericMapper<BlogCommentCreateDTO, BlogCommentUpdateDTO, BlogCommentGetDTO, BlogCommentDetailDTO, BlogComment> {
}
