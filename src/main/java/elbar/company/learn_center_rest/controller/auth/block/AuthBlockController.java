package elbar.company.learn_center_rest.controller.auth.block;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.block.AuthBlockCriteria;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockCreateDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockGetDTO;
import elbar.company.learn_center_rest.dto.auth.block.AuthBlockUpdateDTO;

import java.util.UUID;

public interface AuthBlockController extends GenericCUDController<AuthBlockCreateDTO, AuthBlockUpdateDTO, UUID>, GenericGLDController<AuthBlockGetDTO, AuthBlockDetailDTO, AuthBlockCriteria, UUID> {
}
