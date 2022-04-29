package elbar.company.learn_center_rest.mapper.auth.user_role;

import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.user_role.AuthUserRole;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserRoleMapper extends GenericMapper<UserRoleCreateDTO, UserRoleUpdateDTO, UserRoleGetDTO, UserRoleDetailDTO, AuthUserRole> {
}
