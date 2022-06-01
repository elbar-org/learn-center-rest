package elbar.company.learn_center_rest.service.auth.card;

import elbar.company.learn_center_rest.criteria.auth.card.CardCriteria;
import elbar.company.learn_center_rest.dto.auth.card.CardCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardGetDTO;
import elbar.company.learn_center_rest.dto.auth.card.CardUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.block_reason.AuthBlockReason;
import elbar.company.learn_center_rest.entity.auth.card.AuthCard;
import elbar.company.learn_center_rest.mapper.auth.card.CardMapper;
import elbar.company.learn_center_rest.repository.auth.card.CardRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.card.CardValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CardServiceImpl extends AbstractService<CardValidator, CardMapper, CardRepository> implements CardService {
    public CardServiceImpl(CardValidator validator, CardMapper mapper, CardRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CardCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CardUpdateDTO DTO) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<AuthCard> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Auth Card not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CardGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Block Reason not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CardDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Block Reason not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CardGetDTO>>> list(CardCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
