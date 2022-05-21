package elbar.company.learn_center_rest.service.course.course_level;

import elbar.company.learn_center_rest.criteria.course.course_level.CourseLevelCriteria;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelGetDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseLevelService extends GenericCUDService<CourseLevelCreateDTO, CourseLevelUpdateDTO, UUID>, GenericGLDService<CourseLevelGetDTO, CourseLevelDetailDTO, CourseLevelCriteria, UUID> {
}
