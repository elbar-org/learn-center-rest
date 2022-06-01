package elbar.company.learn_center_rest.mapper.course.course_video_materials;

import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_materials.CourseVideoMaterialsUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_video_materials.CourseVideoMaterials;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseVideoMaterialsMapper extends GenericMapper<CourseVideoMaterialsCreateDTO, CourseVideoMaterialsUpdateDTO, CourseVideoMaterialsGetDTO, CourseVideoMaterialsDetailDTO, CourseVideoMaterials> {
}
