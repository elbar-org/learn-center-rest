package elbar.company.learn_center_rest.controller.auth.status;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.status.StatusCriteria;
import elbar.company.learn_center_rest.dto.auth.status.StatusCreateDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusDetailDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusGetDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusUpdateDTO;

import java.util.UUID;

public interface StatusController extends GenericCUDController<StatusCreateDTO, StatusUpdateDTO, UUID>, GenericGLDController<StatusGetDTO, StatusDetailDTO, StatusCriteria, UUID> {
}
