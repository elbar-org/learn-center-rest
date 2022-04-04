package elbar.company.learn_center_rest.controller.auth.user;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserLoginDTO;
import elbar.company.learn_center_rest.service.auth.user.AuthUserServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/auth/")
public class AuthUserController extends AbstractController<AuthUserServiceImpl> {
    public AuthUserController(AuthUserServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Object login(@Valid @RequestBody AuthUserLoginDTO dto) {
        HttpEntity<AuthUserLoginDTO> entity = new HttpEntity<>(dto);
        ResponseEntity<Object> exchange = BaseUtils.TEMPLATE.exchange("http://localhost:80/api/v1/login", HttpMethod.POST, entity, Object.class);
        return exchange.getBody();
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(@Valid @RequestBody AuthUserCreateDTO dto) {
        service.create(dto);
        return "successfully registered";
    }
}
