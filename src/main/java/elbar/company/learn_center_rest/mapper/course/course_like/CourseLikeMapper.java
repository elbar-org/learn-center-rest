package elbar.company.learn_center_rest.mapper.course.course_like;

import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_like.CourseLike;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseLikeMapper extends GenericMapper<CourseLikeCreateDTO, CourseLikeUpdateDTO, CourseLikeGetDTO, CourseLikeDetailDTO, CourseLike> {
}
