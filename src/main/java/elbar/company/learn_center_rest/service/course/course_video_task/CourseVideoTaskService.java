package elbar.company.learn_center_rest.service.course.course_video_task;

import elbar.company.learn_center_rest.criteria.course.course_video_task.CourseVideoTaskCriteria;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseVideoTaskService extends GenericCUDService<CourseVideoTaskCreateDTO, CourseVideoTaskUpdateDTO, UUID>, GenericGLDService<CourseVideoTaskGetDTO, CourseVideoTaskDetailDTO, CourseVideoTaskCriteria, UUID> {
}
