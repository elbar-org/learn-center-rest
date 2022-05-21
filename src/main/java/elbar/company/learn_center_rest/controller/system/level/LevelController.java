package elbar.company.learn_center_rest.controller.system.level;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.system.level.LevelCriteria;
import elbar.company.learn_center_rest.dto.system.level.LevelCreateDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelDetailDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelGetDTO;
import elbar.company.learn_center_rest.dto.system.level.LevelUpdateDTO;

import java.util.UUID;

public interface LevelController extends GenericCUDController<LevelCreateDTO, LevelUpdateDTO, UUID>, GenericGLDController<LevelGetDTO, LevelDetailDTO, LevelCriteria, UUID> {
}
