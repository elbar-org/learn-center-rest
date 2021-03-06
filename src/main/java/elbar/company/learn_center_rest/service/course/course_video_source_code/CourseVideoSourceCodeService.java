package elbar.company.learn_center_rest.service.course.course_video_source_code;

import elbar.company.learn_center_rest.criteria.course.course_video_source_code.CourseVideoSourceCodeCriteria;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseVideoSourceCodeService extends GenericCUDService<CourseVideoSourceCodeCreateDTO, CourseVideoSourceCodeUpdateDTO, UUID>, GenericGLDService<CourseVideoSourceCodeGetDTO, CourseVideoSourceCodeDetailDTO, CourseVideoSourceCodeCriteria, UUID> {
}
