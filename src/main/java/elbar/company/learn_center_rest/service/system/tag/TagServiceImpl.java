package elbar.company.learn_center_rest.service.system.tag;

import elbar.company.learn_center_rest.criteria.system.tag.TagCriteria;
import elbar.company.learn_center_rest.dto.system.tag.TagCreateDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagDetailDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagGetDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagUpdateDTO;
import elbar.company.learn_center_rest.entity.system.tag.Tag;
import elbar.company.learn_center_rest.mapper.system.tag.TagMapper;
import elbar.company.learn_center_rest.repository.system.tag.TagRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.system.tag.TagValidator;
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
public class TagServiceImpl extends AbstractService<TagValidator, TagMapper, TagRepository> implements TagService {
    public TagServiceImpl(TagValidator validator, TagMapper mapper, TagRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(TagCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(TagUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Optional<Tag> optional = repository.getByCode(DTO.getCode());
        if (optional.isEmpty()) {
            throw new NotFoundException("Tag not found");
        }
        Tag tag = optional.get();
        tag.setName(DTO.getName());
        tag.setPublished(DTO.isPublished());
        tag.setUpdatedAt(LocalDateTime.now());
        repository.save(tag);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<Tag> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Tag not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TagGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Tag not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TagDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Tag not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<TagGetDTO>>> list(TagCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
