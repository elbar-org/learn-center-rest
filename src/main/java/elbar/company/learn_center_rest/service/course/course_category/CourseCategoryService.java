package elbar.company.learn_center_rest.service.course.course_category;

import elbar.company.learn_center_rest.criteria.course.course_category.CourseCategoryCriteria;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryGetDTO;
import elbar.company.learn_center_rest.dto.course.course_category.CourseCategoryUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseCategoryService extends GenericCUDService<CourseCategoryCreateDTO, CourseCategoryUpdateDTO, UUID>, GenericGLDService<CourseCategoryGetDTO, CourseCategoryDetailDTO, CourseCategoryCriteria, UUID> {
}
