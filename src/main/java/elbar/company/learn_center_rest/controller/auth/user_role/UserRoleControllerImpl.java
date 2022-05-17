package elbar.company.learn_center_rest.controller.auth.user_role;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.user_role.UserRoleCriteria;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.user_role.UserRoleUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.user_role.UserRoleServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/user_role/*")
public class UserRoleControllerImpl extends AbstractController<UserRoleServiceImpl> implements UserRoleController {

    public UserRoleControllerImpl(UserRoleServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(UserRoleCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - User Role"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(UserRoleUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - User Role"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        return new ResponseEntity<>(new Data<>("Successfully deleted - User Role"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<UserRoleGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<UserRoleDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<UserRoleGetDTO>>> list(UserRoleCriteria criteria) {
        return service.list(criteria);
    }
}
