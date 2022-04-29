package elbar.company.learn_center_rest.service.auth.teacher_skills;

import elbar.company.learn_center_rest.criteria.auth.teacher_skills.TeacherSkillsCriteria;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface TeacherSkillsService extends GenericCUDService<TeacherSkillsCreateDTO, TeacherSkillsUpdateDTO, UUID>, GenericGLDService<TeacherSkillsGetDTO, TeacherSkillsDetailDTO, TeacherSkillsCriteria, UUID> {
}
