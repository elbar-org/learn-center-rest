package elbar.company.learn_center_rest.service.course.course_video;

import elbar.company.learn_center_rest.criteria.course.course_video.CourseVideoCriteria;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseVideoService extends GenericCUDService<CourseVideoCreateDTO, CourseVideoUpdateDTO, UUID>, GenericGLDService<CourseVideoGetDTO, CourseVideoDetailDTO, CourseVideoCriteria, UUID> {
}
