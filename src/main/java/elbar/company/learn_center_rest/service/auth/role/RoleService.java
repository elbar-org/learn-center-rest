package elbar.company.learn_center_rest.service.auth.role;

import elbar.company.learn_center_rest.criteria.auth.role.RoleCriteria;
import elbar.company.learn_center_rest.dto.auth.role.RoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface RoleService extends GenericCUDService<RoleCreateDTO, RoleUpdateDTO, UUID>, GenericGLDService<RoleGetDTO, RoleDetailDTO, RoleCriteria, UUID> {
}
