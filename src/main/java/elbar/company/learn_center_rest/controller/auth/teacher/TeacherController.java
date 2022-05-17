package elbar.company.learn_center_rest.controller.auth.teacher;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.teacher.TeacherCriteria;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherUpdateDTO;

import java.util.UUID;

public interface TeacherController extends GenericCUDController<TeacherCreateDTO, TeacherUpdateDTO, UUID>, GenericGLDController<TeacherGetDTO, TeacherDetailDTO, TeacherCriteria, UUID> {
}
