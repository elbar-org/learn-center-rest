package elbar.company.learn_center_rest.controller.course.course_like;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_like.CourseLikeCriteria;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeUpdateDTO;

import java.util.UUID;

public interface CourseLikeController extends GenericCUDController<CourseLikeCreateDTO, CourseLikeUpdateDTO, UUID>, GenericGLDController<CourseLikeGetDTO, CourseLikeDetailDTO, CourseLikeCriteria, UUID> {
}
