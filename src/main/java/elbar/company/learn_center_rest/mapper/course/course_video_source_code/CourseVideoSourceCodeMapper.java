package elbar.company.learn_center_rest.mapper.course.course_video_source_code;

import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_video_source_code.CourseVideoSourceCode;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseVideoSourceCodeMapper extends GenericMapper<CourseVideoSourceCodeCreateDTO, CourseVideoSourceCodeUpdateDTO, CourseVideoSourceCodeGetDTO, CourseVideoSourceCodeDetailDTO, CourseVideoSourceCode> {
}
