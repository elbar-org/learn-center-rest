package elbar.company.learn_center_rest.controller.course.course_tag;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_tag.CourseTagCriteria;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagGetDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagUpdateDTO;

import java.util.UUID;

public interface CourseTagController extends GenericCUDController<CourseTagCreateDTO, CourseTagUpdateDTO, UUID>, GenericGLDController<CourseTagGetDTO, CourseTagDetailDTO, CourseTagCriteria, UUID> {
}
