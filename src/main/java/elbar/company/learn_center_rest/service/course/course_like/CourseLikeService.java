package elbar.company.learn_center_rest.service.course.course_like;

import elbar.company.learn_center_rest.criteria.course.course_like.CourseLikeCriteria;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseLikeService extends GenericCUDService<CourseLikeCreateDTO, CourseLikeUpdateDTO, UUID>, GenericGLDService<CourseLikeGetDTO, CourseLikeDetailDTO, CourseLikeCriteria, UUID> {
}
