package elbar.company.learn_center_rest.controller.course.course_video_task;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_video_task.CourseVideoTaskCriteria;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskUpdateDTO;

import java.util.UUID;

public interface CourseVideoTaskController extends GenericCUDController<CourseVideoTaskCreateDTO, CourseVideoTaskUpdateDTO, UUID>, GenericGLDController<CourseVideoTaskGetDTO, CourseVideoTaskDetailDTO, CourseVideoTaskCriteria, UUID> {
}
