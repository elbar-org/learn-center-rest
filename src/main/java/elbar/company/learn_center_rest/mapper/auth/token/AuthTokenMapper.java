package elbar.company.learn_center_rest.mapper.auth.token;

import elbar.company.learn_center_rest.dto.auth.token.AuthTokenCreateDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenDetailDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenGetDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.token.AuthToken;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AuthTokenMapper extends GenericMapper<AuthTokenCreateDTO, AuthTokenUpdateDTO, AuthTokenGetDTO, AuthTokenDetailDTO, AuthToken> {
}
