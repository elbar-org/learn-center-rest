package elbar.company.learn_center_rest.mapper.course.course_level;

import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelGetDTO;
import elbar.company.learn_center_rest.dto.course.course_level.CourseLevelUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_level.CourseLevel;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseLevelMapper extends GenericMapper<CourseLevelCreateDTO, CourseLevelUpdateDTO, CourseLevelGetDTO, CourseLevelDetailDTO, CourseLevel> {
}
