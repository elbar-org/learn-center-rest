package elbar.company.learn_center_rest.controller.system.skill;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.system.skill.SkillCriteria;
import elbar.company.learn_center_rest.dto.system.skill.SkillCreateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillDetailDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillGetDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillUpdateDTO;

import java.util.UUID;

public interface SkillController extends GenericCUDController<SkillCreateDTO, SkillUpdateDTO, UUID>, GenericGLDController<SkillGetDTO, SkillDetailDTO, SkillCriteria, UUID> {
}
