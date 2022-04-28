package elbar.company.learn_center_rest.service.auth.block_reason;

import elbar.company.learn_center_rest.criteria.auth.block_reason.BlockReasonCriteria;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonCreateDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonDetailDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonGetDTO;
import elbar.company.learn_center_rest.dto.auth.block_reason.BlockReasonUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.block_reason.AuthBlockReason;
import elbar.company.learn_center_rest.entity.auth.language.Language;
import elbar.company.learn_center_rest.mapper.auth.block_reason.BlockReasonMapper;
import elbar.company.learn_center_rest.repository.auth.block_reason.BlockReasonRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.block_reason.BlockReasonValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class BlockReasonServiceImpl extends AbstractService<BlockReasonValidator, BlockReasonMapper, BlockReasonRepository> implements BlockReasonService {
    public BlockReasonServiceImpl(BlockReasonValidator validator, BlockReasonMapper mapper, BlockReasonRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(BlockReasonCreateDTO DTO) {
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(BlockReasonUpdateDTO DTO) {
        AuthBlockReason reason = repository.getByCode(DTO.getCode());
        reason.setName(DTO.getName());
        reason.setPublished(DTO.isPublished());
        reason.setUpdatedAt(LocalDateTime.now());
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<BlockReasonGetDTO>> get(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<BlockReasonDetailDTO>> detail(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<BlockReasonGetDTO>>> list(BlockReasonCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        Page<AuthBlockReason> all = repository.findAll(request);
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all.toList()), all.getSize()), HttpStatus.OK);
    }
}
