package elbar.company.learn_center_rest.service.auth.block;

import elbar.company.learn_center_rest.criteria.auth.block.AuthBlockCriteria;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockCreateDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockGetDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface AuthBlockService extends GenericCUDService<AuthBlockCreateDTO, AuthBlockUpdateDTO, UUID>, GenericGLDService<AuthBlockGetDTO, AuthBlockDetailDTO, AuthBlockCriteria, UUID> {
}
