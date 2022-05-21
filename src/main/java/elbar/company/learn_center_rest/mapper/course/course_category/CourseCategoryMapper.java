package elbar.company.learn_center_rest.mapper.course.course_category;

import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryGetDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_category.CourseCategory;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseCategoryMapper extends GenericMapper<CourseCategoryCreateDTO, CourseCategoryUpdateDTO, CourseCategoryGetDTO, CourseCategoryDetailDTO, CourseCategory> {
}
