package elbar.company.learn_center_rest.controller.auth.card_type;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.card_type.CardTypeCriteria;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeGetDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeUpdateDTO;

import java.util.UUID;

public interface CardTypeController extends GenericCUDController<CardTypeCreateDTO, CardTypeUpdateDTO, UUID>, GenericGLDController<CardTypeGetDTO, CardTypeDetailDTO, CardTypeCriteria, UUID> {
}
