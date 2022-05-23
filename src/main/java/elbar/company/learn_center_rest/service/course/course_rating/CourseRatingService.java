package elbar.company.learn_center_rest.service.course.course_rating;

import elbar.company.learn_center_rest.criteria.course.course_rating.CourseRatingCriteria;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingGetDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseRatingService extends GenericCUDService<CourseRatingCreateDTO, CourseRatingUpdateDTO, UUID>, GenericGLDService<CourseRatingGetDTO, CourseRatingDetailDTO, CourseRatingCriteria, UUID> {
}
