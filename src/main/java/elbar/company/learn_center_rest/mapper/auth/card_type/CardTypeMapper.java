package elbar.company.learn_center_rest.mapper.auth.card_type;

import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeGetDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.card_type.AuthCardType;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CardTypeMapper extends GenericMapper<CardTypeCreateDTO, CardTypeUpdateDTO, CardTypeGetDTO, CardTypeDetailDTO, AuthCardType> {
}
