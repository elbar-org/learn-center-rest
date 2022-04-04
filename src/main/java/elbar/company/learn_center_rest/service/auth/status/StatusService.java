package elbar.company.learn_center_rest.service.auth.status;

import elbar.company.learn_center_rest.criteria.auth.status.StatusCriteria;
import elbar.company.learn_center_rest.dto.auth.status.StatusCreateDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusDetailDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusGetDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface StatusService extends GenericCUDService<StatusCreateDTO, StatusUpdateDTO, UUID>, GenericGLDService<StatusGetDTO, StatusDetailDTO, StatusCriteria, UUID> {
}
