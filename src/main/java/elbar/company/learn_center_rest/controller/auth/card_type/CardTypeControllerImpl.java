package elbar.company.learn_center_rest.controller.auth.card_type;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.card_type.CardTypeCriteria;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeGetDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.card_type.CardTypeServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/card_type/*")
public class CardTypeControllerImpl extends AbstractController<CardTypeServiceImpl> implements CardTypeController {
    public CardTypeControllerImpl(CardTypeServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(CardTypeCreateDTO DTO) {
        return new ResponseEntity<>(new Data<>("Successfully created - Auth Card Type"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(CardTypeUpdateDTO DTO) {
        return new ResponseEntity<>(new Data<>("Successfully updated - Auth Card Type"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        return new ResponseEntity<>(new Data<>("Successfully deleted - Auth Card Type"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CardTypeGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<CardTypeDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<CardTypeGetDTO>>> list(CardTypeCriteria criteria) {
        return service.list(criteria);
    }
}
