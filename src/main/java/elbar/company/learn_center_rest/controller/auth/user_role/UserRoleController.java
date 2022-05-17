package elbar.company.learn_center_rest.controller.auth.user_role;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.user_role.UserRoleCriteria;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleUpdateDTO;

import java.util.UUID;

public interface UserRoleController extends GenericCUDController<UserRoleCreateDTO, UserRoleUpdateDTO, UUID>, GenericGLDController<UserRoleGetDTO, UserRoleDetailDTO, UserRoleCriteria, UUID> {
}
