package elbar.company.learn_center_rest.mapper.auth.teacher_skills;

import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.teacher_skills.TeacherSkills;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface TeacherSkillsMapper extends GenericMapper<TeacherSkillsCreateDTO, TeacherSkillsUpdateDTO, TeacherSkillsGetDTO, TeacherSkillsDetailDTO, TeacherSkills> {
}
