package elbar.company.learn_center_rest.service.course.course_tag;

import elbar.company.learn_center_rest.criteria.course.course_tag.CourseTagCriteria;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagGetDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseTagService extends GenericCUDService<CourseTagCreateDTO, CourseTagUpdateDTO, UUID>, GenericGLDService<CourseTagGetDTO, CourseTagDetailDTO, CourseTagCriteria, UUID> {
}
