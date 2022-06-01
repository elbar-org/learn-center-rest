package elbar.company.learn_center_rest.controller.auth.token;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.role.RoleCriteria;
import elbar.company.learn_center_rest.criteria.auth.token.AuthTokenCriteria;
import elbar.company.learn_center_rest.dto.auth.role.RoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenDetailDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenGetDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.token.AuthTokenServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<AuthTokenDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<AuthTokenGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<AuthTokenGetDTO>>> getAll(@Valid AuthTokenCriteria criteria) {
        return service.list(criteria);
    }
}
