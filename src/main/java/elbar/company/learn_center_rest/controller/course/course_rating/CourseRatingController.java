package elbar.company.learn_center_rest.controller.course.course_rating;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_rating.CourseRatingCriteria;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingGetDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingUpdateDTO;

import java.util.UUID;

public interface CourseRatingController extends GenericCUDController<CourseRatingCreateDTO, CourseRatingUpdateDTO, UUID>, GenericGLDController<CourseRatingGetDTO, CourseRatingDetailDTO, CourseRatingCriteria, UUID> {
}
