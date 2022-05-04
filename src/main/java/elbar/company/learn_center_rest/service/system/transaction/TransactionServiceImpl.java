package elbar.company.learn_center_rest.service.system.transaction;

import elbar.company.learn_center_rest.criteria.system.transaction.TransactionCriteria;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionGetDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionUpdateDTO;
import elbar.company.learn_center_rest.entity.system.transaction.Transaction;
import elbar.company.learn_center_rest.mapper.system.transaction.TransactionMapper;
import elbar.company.learn_center_rest.repository.system.transaction.TransactionRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.system.transaction.TransactionValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransactionServiceImpl extends AbstractService<TransactionValidator, TransactionMapper, TransactionRepository> implements TransactionService {
    public TransactionServiceImpl(TransactionValidator validator, TransactionMapper mapper, TransactionRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(TransactionCreateDTO DTO) {
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(TransactionUpdateDTO DTO) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TransactionGetDTO>> get(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TransactionDetailDTO>> detail(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<TransactionGetDTO>>> list(TransactionCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        Page<Transaction> all = repository.findAll(request);
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all.toList()), all.getSize()), HttpStatus.OK);
    }
}
