package elbar.company.learn_center_rest.mapper.blog.blog_category;

import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryUpdateDTO;
import elbar.company.learn_center_rest.entity.blog.blog_category.BlogCategory;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BlogCategoryMapper extends GenericMapper<BlogCategoryCreateDTO, BlogCategoryUpdateDTO, BlogCategoryGetDTO, BlogCategoryDetailDTO, BlogCategory> {
}
