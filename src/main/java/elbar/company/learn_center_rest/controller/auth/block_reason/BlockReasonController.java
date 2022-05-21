package elbar.company.learn_center_rest.controller.auth.block_reason;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.block_reason.BlockReasonCriteria;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonCreateDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonGetDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonUpdateDTO;

import java.util.UUID;

public interface BlockReasonController extends GenericCUDController<BlockReasonCreateDTO, BlockReasonUpdateDTO, UUID>, GenericGLDController<BlockReasonGetDTO, BlockReasonDetailDTO, BlockReasonCriteria, UUID> {
}
