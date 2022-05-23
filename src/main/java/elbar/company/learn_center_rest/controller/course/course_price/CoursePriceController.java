package elbar.company.learn_center_rest.controller.course.course_price;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_price.CoursePriceCriteria;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceGetDTO;
import elbar.company.learn_center_rest.dto.course.course_price.CoursePriceUpdateDTO;

import java.util.UUID;

public interface CoursePriceController extends GenericCUDController<CoursePriceCreateDTO, CoursePriceUpdateDTO, UUID>, GenericGLDController<CoursePriceGetDTO, CoursePriceDetailDTO, CoursePriceCriteria, UUID> {
}
