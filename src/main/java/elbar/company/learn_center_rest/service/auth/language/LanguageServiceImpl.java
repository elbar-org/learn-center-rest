package elbar.company.learn_center_rest.service.auth.language;

import elbar.company.learn_center_rest.criteria.auth.language.LanguageCriteria;
import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageDetailDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageGetDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.language.Language;
import elbar.company.learn_center_rest.mapper.auth.language.LanguageMapper;
import elbar.company.learn_center_rest.repository.auth.language.LanguageRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class LanguageServiceImpl extends AbstractService<LanguageMapper, LanguageRepository> implements LanguageService {

    public LanguageServiceImpl(LanguageValidator validator, LanguageMapper mapper, LanguageRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(LanguageCreateDTO DTO) {
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(LanguageUpdateDTO DTO) {
        Language language = repository.getByCode(DTO.getCode());
        language.setName(DTO.getName());
        language.setPublished(DTO.getIsPublished());
        language.setUpdatedAt(LocalDateTime.now());
        repository.save(language);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<LanguageGetDTO>> get(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<LanguageDetailDTO>> detail(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<LanguageGetDTO>>> list(LanguageCriteria criteria) {
        List<Language> all = repository.findAll();
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all), all.size()), HttpStatus.OK);
    public ResponseEntity<Data<List<LanguageGetDTO>>> list() {
        return null;
    }

    public ResponseEntity<Data<List<LanguageGetDTO>>> list(LanguageCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        Page<Language> all = repository.findAll(request);
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all.toList()), all.getSize()), HttpStatus.OK);
    }
}
