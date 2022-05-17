package elbar.company.learn_center_rest.controller.auth.card;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.card.CardCriteria;
import elbar.company.learn_center_rest.dto.auth.card.CardCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardGetDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.card.CardServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/card/*")
public class CardControllerImpl extends AbstractController<CardServiceImpl> implements CardController {

    public CardControllerImpl(CardServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(CardCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Auth Card"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(CardUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Auth Card"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        return new ResponseEntity<>(new Data<>("Successfully deleted - Auth Card"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CardGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<CardDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<CardGetDTO>>> list(CardCriteria criteria) {
        return service.list(criteria);
    }
}
