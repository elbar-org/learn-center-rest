package elbar.company.learn_center_rest.service.auth.user_role;

import elbar.company.learn_center_rest.criteria.auth.user_role.UserRoleCriteria;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface UserRoleService extends GenericCUDService<UserRoleCreateDTO, UserRoleUpdateDTO, UUID>, GenericGLDService<UserRoleGetDTO, UserRoleDetailDTO, UserRoleCriteria, UUID> {
}
