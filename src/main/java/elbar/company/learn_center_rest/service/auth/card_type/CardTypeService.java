package elbar.company.learn_center_rest.service.auth.card_type;

import elbar.company.learn_center_rest.criteria.auth.card_type.CardTypeCriteria;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeGetDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CardTypeService extends GenericCUDService<CardTypeCreateDTO, CardTypeUpdateDTO, UUID>, GenericGLDService<CardTypeGetDTO, CardTypeDetailDTO, CardTypeCriteria, UUID> {
}
