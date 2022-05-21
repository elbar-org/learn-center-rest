package elbar.company.learn_center_rest.controller.course.course;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course.CourseCriteria;
import elbar.company.learn_center_rest.dto.course.course.CourseCreateDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseDetailDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseGetDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseUpdateDTO;

import java.util.UUID;

public interface CourseController extends GenericCUDController<CourseCreateDTO, CourseUpdateDTO, UUID>, GenericGLDController<CourseGetDTO, CourseDetailDTO, CourseCriteria, UUID> {
}
