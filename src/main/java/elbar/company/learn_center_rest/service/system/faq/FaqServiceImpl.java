package elbar.company.learn_center_rest.service.system.faq;

import elbar.company.learn_center_rest.criteria.system.faq.FaqCriteria;
import elbar.company.learn_center_rest.dto.system.faq.FaqCreateDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqDetailDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqGetDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.block.AuthBlock;
import elbar.company.learn_center_rest.entity.system.faq.Faq;
import elbar.company.learn_center_rest.mapper.system.faq.FaqMapper;
import elbar.company.learn_center_rest.repository.system.faq.FaqRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.system.faq.FaqValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class FaqServiceImpl extends AbstractService<FaqValidator, FaqMapper, FaqRepository> implements FaqService {
    public FaqServiceImpl(FaqValidator validator, FaqMapper mapper, FaqRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(FaqCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(FaqUpdateDTO DTO) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<Faq> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Faq not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<FaqGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Faq not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<FaqDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Faq not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<FaqGetDTO>>> list(FaqCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
