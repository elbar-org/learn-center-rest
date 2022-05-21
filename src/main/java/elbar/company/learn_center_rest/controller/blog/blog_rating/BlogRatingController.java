package elbar.company.learn_center_rest.controller.blog.blog_rating;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.blog.blog_rating.BlogRatingCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingUpdateDTO;

import java.util.UUID;

public interface BlogRatingController extends GenericCUDController<BlogRatingCreateDTO, BlogRatingUpdateDTO, UUID>, GenericGLDController<BlogRatingGetDTO, BlogRatingDetailDTO, BlogRatingCriteria, UUID> {
}
