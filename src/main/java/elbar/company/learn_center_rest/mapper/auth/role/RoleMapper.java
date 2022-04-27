package elbar.company.learn_center_rest.mapper.auth.role;

import elbar.company.learn_center_rest.dto.auth.role.RoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.role.Role;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface RoleMapper extends GenericMapper<RoleCreateDTO, RoleUpdateDTO, RoleGetDTO, RoleDetailDTO, Role> {
}
