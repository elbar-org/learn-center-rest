package elbar.company.learn_center_rest.service.system.level;

import elbar.company.learn_center_rest.criteria.system.level.LevelCriteria;
import elbar.company.learn_center_rest.dto.system.level.LevelCreateDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelDetailDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelGetDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface LevelService extends GenericCUDService<LevelCreateDTO, LevelUpdateDTO, UUID>, GenericGLDService<LevelGetDTO, LevelDetailDTO, LevelCriteria, UUID> {
}
