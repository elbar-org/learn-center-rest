package elbar.company.learn_center_rest.service.auth.token;

import elbar.company.learn_center_rest.dto.auth.token.AuthTokenCreateDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenGetDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenUpdateDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserDetailDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public interface AuthTokenService extends GenericCUDService<AuthTokenCreateDTO, AuthTokenUpdateDTO, UUID>, GenericGLDService<AuthTokenGetDTO, AuthUserDetailDTO, UUID> {
    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
