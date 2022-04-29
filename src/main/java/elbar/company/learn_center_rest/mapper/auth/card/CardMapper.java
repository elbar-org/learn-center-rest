package elbar.company.learn_center_rest.mapper.auth.card;

import elbar.company.learn_center_rest.dto.auth.card.CardCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardGetDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.card.AuthCard;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CardMapper extends GenericMapper<CardCreateDTO, CardUpdateDTO, CardGetDTO, CardDetailDTO, AuthCard> {
}
