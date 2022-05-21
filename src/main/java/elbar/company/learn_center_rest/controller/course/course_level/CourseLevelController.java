package elbar.company.learn_center_rest.controller.course.course_level;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_level.CourseLevelCriteria;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelGetDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelUpdateDTO;

import java.util.UUID;

public interface CourseLevelController extends GenericCUDController<CourseLevelCreateDTO, CourseLevelUpdateDTO, UUID>, GenericGLDController<CourseLevelGetDTO, CourseLevelDetailDTO, CourseLevelCriteria, UUID> {
}
