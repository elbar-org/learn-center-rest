package elbar.company.learn_center_rest.controller.auth.user;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.user.AuthUserCriteria;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserGetDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserLoginDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.user.AuthUserServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

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
    public ResponseEntity<Data<String>> register(@Valid @RequestBody AuthUserCreateDTO dto) {
        service.create(dto);
        return new ResponseEntity<>(new Data<>("Successfully Registered"), HttpStatus.OK);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<String>> delete(@PathVariable UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Auth User"), HttpStatus.OK);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<AuthUserDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<AuthUserGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<AuthUserGetDTO>>> getAll(@Valid AuthUserCriteria criteria) {
        return service.list(criteria);
    }
}
