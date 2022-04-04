package elbar.company.learn_center_rest.controller.auth.token;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.service.auth.token.AuthTokenServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/auth/")
public class AuthTokenController extends AbstractController<AuthTokenServiceImpl> {
    public AuthTokenController(AuthTokenServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "refresh-token", method = RequestMethod.GET)
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        service.refreshToken(request, response);
    }
}
