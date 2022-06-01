package elbar.company.learn_center_rest.service.blog.blog_comment;

import elbar.company.learn_center_rest.criteria.blog.blog_comment.BlogCommentCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentUpdateDTO;
import elbar.company.learn_center_rest.entity.blog.blog_comment.BlogComment;
import elbar.company.learn_center_rest.mapper.blog.blog_comment.BlogCommentMapper;
import elbar.company.learn_center_rest.repository.blog.blog_comment.BlogCommentRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.blog.blog_comment.BlogCommentValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class BlogCommentServiceImpl extends AbstractService<BlogCommentValidator, BlogCommentMapper, BlogCommentRepository> implements BlogCommentService {
    public BlogCommentServiceImpl(BlogCommentValidator validator, BlogCommentMapper mapper, BlogCommentRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(BlogCommentCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(BlogCommentUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        BlogComment comment = repository.getByCode(DTO.getCode());
        comment.setMessage(DTO.getMessage());
        comment.setUpdatedAt(LocalDateTime.now());
        repository.save(comment);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<BlogCommentGetDTO>> get(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<BlogCommentDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<BlogCommentGetDTO>>> list(BlogCommentCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
