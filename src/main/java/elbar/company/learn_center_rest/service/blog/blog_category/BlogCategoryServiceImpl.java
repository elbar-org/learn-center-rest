package elbar.company.learn_center_rest.service.blog.blog_category;

import elbar.company.learn_center_rest.criteria.blog.blog_category.BlogCategoryCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_category.BlogCategoryUpdateDTO;
import elbar.company.learn_center_rest.entity.blog.blog_category.BlogCategory;
import elbar.company.learn_center_rest.mapper.blog.blog_category.BlogCategoryMapper;
import elbar.company.learn_center_rest.repository.blog.blog_category.BlogCategoryRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.blog.blog_category.BlogCategoryValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class BlogCategoryServiceImpl extends AbstractService<BlogCategoryValidator, BlogCategoryMapper, BlogCategoryRepository> implements BlogCategoryService {
    public BlogCategoryServiceImpl(BlogCategoryValidator validator, BlogCategoryMapper mapper, BlogCategoryRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(BlogCategoryCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(BlogCategoryUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        Optional<BlogCategory> optional = repository.getByCode(DTO.getCode());
        if (optional.isEmpty()) {
            throw new NotFoundException("Blog Category not found");
        }
        BlogCategory category = optional.get();
        category.setTitle(DTO.getTitle());
        category.setDescription(DTO.getDescription());
        category.setPublished(DTO.getIsPublished());
        category.setUpdatedAt(LocalDateTime.now());
        repository.save(category);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        Optional<BlogCategory> optional = repository.getByCode(key);
        if (optional.isEmpty()) {
            throw new NotFoundException("Blog Category not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<BlogCategoryGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Blog Category not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<BlogCategoryDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key).orElseThrow(() -> new NotFoundException("Blog Category not found")))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<BlogCategoryGetDTO>>> list(BlogCategoryCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize(), criteria.getSort(), criteria.getFieldsEnum().getValue());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
