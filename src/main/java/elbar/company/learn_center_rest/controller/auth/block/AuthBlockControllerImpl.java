package elbar.company.learn_center_rest.controller.auth.block;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.block.AuthBlockCriteria;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockCreateDDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockGetDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.block.AuthBlockServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/auth_block/*")
public class AuthBlockControllerImpl extends AbstractController<AuthBlockServiceImpl> implements AuthBlockController {

    public AuthBlockControllerImpl(AuthBlockServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(AuthBlockCreateDDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Auth Block"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(AuthBlockUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Auth Block"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Auth Block"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<AuthBlockGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<AuthBlockDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<AuthBlockGetDTO>>> list(AuthBlockCriteria criteria) {
        return service.list(criteria);
    }
}
