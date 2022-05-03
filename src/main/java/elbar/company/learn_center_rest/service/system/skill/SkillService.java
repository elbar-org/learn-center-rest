package elbar.company.learn_center_rest.service.system.skill;

import elbar.company.learn_center_rest.criteria.system.skill.SkillCriteria;
import elbar.company.learn_center_rest.dto.system.skill.SkillCreateDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillDetailDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillGetDTO;
import elbar.company.learn_center_rest.dto.system.skill.SkillUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface SkillService extends GenericCUDService<SkillCreateDTO, SkillUpdateDTO, UUID>, GenericGLDService<SkillGetDTO, SkillDetailDTO, SkillCriteria, UUID> {
}
