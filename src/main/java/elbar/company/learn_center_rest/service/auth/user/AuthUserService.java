package elbar.company.learn_center_rest.service.auth.user;

import elbar.company.learn_center_rest.criteria.auth.user.AuthUserCriteria;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserGetDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.UUID;

public interface AuthUserService extends GenericCUDService<AuthUserCreateDTO, AuthUserUpdateDTO, UUID>, GenericGLDService<AuthUserGetDTO, AuthUserDetailDTO, AuthUserCriteria, UUID>, UserDetailsService {
}
