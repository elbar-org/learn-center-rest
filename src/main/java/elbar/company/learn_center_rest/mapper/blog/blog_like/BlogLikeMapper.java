package elbar.company.learn_center_rest.mapper.blog.blog_like;

import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_like.BlogLikeUpdateDTO;
import elbar.company.learn_center_rest.entity.blog.blog_like.BlogLike;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BlogLikeMapper extends GenericMapper<BlogLikeCreateDTO, BlogLikeUpdateDTO, BlogLikeGetDTO, BlogLikeDetailDTO, BlogLike> {
}
