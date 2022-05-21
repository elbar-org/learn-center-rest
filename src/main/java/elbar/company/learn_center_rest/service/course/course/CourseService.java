package elbar.company.learn_center_rest.service.course.course;

import elbar.company.learn_center_rest.criteria.course.course.CourseCriteria;
import elbar.company.learn_center_rest.dto.course.course.CourseCreateDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseDetailDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseGetDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseService extends GenericCUDService<CourseCreateDTO, CourseUpdateDTO, UUID>, GenericGLDService<CourseGetDTO, CourseDetailDTO, CourseCriteria, UUID> {
}
