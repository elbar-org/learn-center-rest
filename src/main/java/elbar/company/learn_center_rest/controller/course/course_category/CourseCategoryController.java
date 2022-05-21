package elbar.company.learn_center_rest.controller.course.course_category;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_category.CourseCategoryCriteria;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryGetDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryUpdateDTO;

import java.util.UUID;

public interface CourseCategoryController extends GenericCUDController<CourseCategoryCreateDTO, CourseCategoryUpdateDTO, UUID>, GenericGLDController<CourseCategoryGetDTO, CourseCategoryDetailDTO, CourseCategoryCriteria, UUID> {
}
