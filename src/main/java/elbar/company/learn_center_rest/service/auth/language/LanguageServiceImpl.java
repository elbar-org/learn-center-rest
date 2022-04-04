package elbar.company.learn_center_rest.service.auth.language;

import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageDetailDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageGetDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.language.Language;
import elbar.company.learn_center_rest.mapper.auth.language.LanguageMapper;
import elbar.company.learn_center_rest.repository.auth.language.LanguageRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class LanguageServiceImpl extends AbstractService<LanguageMapper, LanguageRepository> implements LanguageService {

    public LanguageServiceImpl(LanguageMapper mapper, LanguageRepository repository) {
        super(mapper, repository);
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
        language.setPublished(DTO.getIs_published());
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
        return null;
    }

    @Override
    public ResponseEntity<Data<List<LanguageGetDTO>>> list() {
        List<Language> all = repository.findAll();
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all), all.size()), HttpStatus.OK);
    }
}
