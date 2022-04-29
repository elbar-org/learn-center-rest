package elbar.company.learn_center_rest.service.auth.card;

import elbar.company.learn_center_rest.criteria.auth.card.CardCriteria;
import elbar.company.learn_center_rest.dto.auth.card.CardCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardGetDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CardService extends GenericCUDService<CardCreateDTO, CardUpdateDTO, UUID>, GenericGLDService<CardGetDTO, CardDetailDTO, CardCriteria, UUID> {
}
