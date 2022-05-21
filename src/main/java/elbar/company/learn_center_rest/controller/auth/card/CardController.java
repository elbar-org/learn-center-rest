package elbar.company.learn_center_rest.controller.auth.card;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.card.CardCriteria;
import elbar.company.learn_center_rest.dto.auth.card.CardCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardGetDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardUpdateDTO;

import java.util.UUID;

public interface CardController extends GenericCUDController<CardCreateDTO, CardUpdateDTO, UUID>, GenericGLDController<CardGetDTO, CardDetailDTO, CardCriteria, UUID> {
}
