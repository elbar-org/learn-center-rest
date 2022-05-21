package elbar.company.learn_center_rest.mapper.course.course;

import elbar.company.learn_center_rest.dto.course.course.CourseCreateDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseDetailDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseGetDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course.Course;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseMapper extends GenericMapper<CourseCreateDTO, CourseUpdateDTO, CourseGetDTO, CourseDetailDTO, Course> {
}
