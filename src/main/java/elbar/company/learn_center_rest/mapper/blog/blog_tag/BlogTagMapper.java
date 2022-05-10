package elbar.company.learn_center_rest.mapper.blog.blog_tag;

import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_tag.BlogTagUpdateDTO;
import elbar.company.learn_center_rest.entity.blog.blog_tag.BlogTag;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BlogTagMapper extends GenericMapper<BlogTagCreateDTO, BlogTagUpdateDTO, BlogTagGetDTO, BlogTagDetailDTO, BlogTag> {
}
