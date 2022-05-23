package elbar.company.learn_center_rest.service.course.course_price;

import elbar.company.learn_center_rest.criteria.course.course_price.CoursePriceCriteria;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceGetDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CoursePriceService extends GenericCUDService<CoursePriceCreateDTO, CoursePriceUpdateDTO, UUID>, GenericGLDService<CoursePriceGetDTO, CoursePriceDetailDTO, CoursePriceCriteria, UUID> {
}
