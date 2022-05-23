package elbar.company.learn_center_rest.mapper.course.course_price;

import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceGetDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_price.CoursePrice;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CoursePriceMapper extends GenericMapper<CoursePriceCreateDTO, CoursePriceUpdateDTO, CoursePriceGetDTO, CoursePriceDetailDTO, CoursePrice> {
}
