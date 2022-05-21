package elbar.company.learn_center_rest.mapper.course.course_tag;

import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagGetDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_tag.CourseTag;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseTagMapper extends GenericMapper<CourseTagCreateDTO, CourseTagUpdateDTO, CourseTagGetDTO, CourseTagDetailDTO, CourseTag> {
}
