package elbar.company.learn_center_rest.mapper.course.course_video;

import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_video.CourseVideo;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseVideoMapper extends GenericMapper<CourseVideoCreateDTO, CourseVideoUpdateDTO, CourseVideoGetDTO, CourseVideoDetailDTO, CourseVideo> {
}
