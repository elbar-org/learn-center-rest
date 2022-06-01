package elbar.company.learn_center_rest.service.auth.card_type;

import elbar.company.learn_center_rest.criteria.auth.card_type.CardTypeCriteria;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeCreateDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeDetailDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeGetDTO;
import elbar.company.learn_center_rest.dto.auth.card_type.CardTypeUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.card_type.AuthCardType;
import elbar.company.learn_center_rest.mapper.auth.card_type.CardTypeMapper;
import elbar.company.learn_center_rest.repository.auth.card_type.CardTypeRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.card_type.CardTypeValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CardTypeServiceImpl extends AbstractService<CardTypeValidator, CardTypeMapper, CardTypeRepository> implements CardTypeService {
    public CardTypeServiceImpl(CardTypeValidator validator, CardTypeMapper mapper, CardTypeRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CardTypeCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CardTypeUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Optional<AuthCardType> optional = repository.getByCode(DTO.getCode());
        if (optional.isEmpty()) {
            throw new NotFoundException("Card Type not found");
        }
        AuthCardType cardType = optional.get();
        cardType.setName(DTO.getName());
        cardType.setPublished(DTO.isPublished());
        cardType.setUpdatedAt(LocalDateTime.now());
        repository.save(cardType);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<AuthCardType> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Card Type not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CardTypeGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Card Type not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CardTypeDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Card Type not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CardTypeGetDTO>>> list(CardTypeCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
