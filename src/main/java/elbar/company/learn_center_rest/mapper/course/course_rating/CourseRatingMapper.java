package elbar.company.learn_center_rest.mapper.course.course_rating;

import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingGetDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_rating.CourseRating;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseRatingMapper extends GenericMapper<CourseRatingCreateDTO, CourseRatingUpdateDTO, CourseRatingGetDTO, CourseRatingDetailDTO, CourseRating> {
}
