package elbar.company.learn_center_rest.mapper.auth.block;

import elbar.company.learn_center_rest.dto.auth.block.AuthBlockCreateDDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockGetDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.block.AuthBlock;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AuthBlockMapper extends GenericMapper<AuthBlockCreateDDTO, AuthBlockUpdateDTO, AuthBlockGetDTO, AuthBlockDetailDTO, AuthBlock> {
}
