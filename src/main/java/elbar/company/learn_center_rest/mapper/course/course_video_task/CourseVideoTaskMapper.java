package elbar.company.learn_center_rest.mapper.course.course_video_task;

import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_video_task.CourseVideoTask;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseVideoTaskMapper extends GenericMapper<CourseVideoTaskCreateDTO, CourseVideoTaskUpdateDTO, CourseVideoTaskGetDTO, CourseVideoTaskDetailDTO, CourseVideoTask> {
}
