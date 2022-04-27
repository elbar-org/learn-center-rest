package elbar.company.learn_center_rest.service.auth.teacher;

import elbar.company.learn_center_rest.criteria.auth.teacher.TeacherCriteria;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherUpdateDTO;
import elbar.company.learn_center_rest.service.BaseService;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface TeacherService extends GenericCUDService<TeacherCreateDTO, TeacherUpdateDTO, UUID>, GenericGLDService<TeacherGetDTO, TeacherDetailDTO, TeacherCriteria, UUID> {
}
