package elbar.company.learn_center_rest.mapper.blog.blog_rating;

import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingUpdateDTO;
import elbar.company.learn_center_rest.entity.blog.blog_rating.BlogRating;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BlogRatingMapper extends GenericMapper<BlogRatingCreateDTO, BlogRatingUpdateDTO, BlogRatingGetDTO, BlogRatingDetailDTO, BlogRating> {
}
