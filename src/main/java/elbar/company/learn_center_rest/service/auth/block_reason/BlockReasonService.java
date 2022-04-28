package elbar.company.learn_center_rest.service.auth.block_reason;

import elbar.company.learn_center_rest.criteria.auth.block_reason.BlockReasonCriteria;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonCreateDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonGetDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface BlockReasonService extends GenericCUDService<BlockReasonCreateDTO, BlockReasonUpdateDTO, UUID>, GenericGLDService<BlockReasonGetDTO, BlockReasonDetailDTO, BlockReasonCriteria, UUID> {
}
