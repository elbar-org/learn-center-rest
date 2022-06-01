package elbar.company.learn_center_rest.controller.course.course_video;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_video.CourseVideoCriteria;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoUpdateDTO;

import java.util.UUID;

public interface CourseVideoController extends GenericCUDController<CourseVideoCreateDTO, CourseVideoUpdateDTO, UUID>, GenericGLDController<CourseVideoGetDTO, CourseVideoDetailDTO, CourseVideoCriteria, UUID> {
}
