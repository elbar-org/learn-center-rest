package elbar.company.learn_center_rest.controller.blog.blog_rating;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.blog.blog_rating.BlogRatingCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_rating.BlogRatingUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.blog.blog_rating.BlogRatingServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/blog_rating/*")
public class BlogRatingControllerImpl extends AbstractController<BlogRatingServiceImpl> implements BlogRatingController {
    public BlogRatingControllerImpl(BlogRatingServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(BlogRatingCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Blog Rating"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(BlogRatingUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Blog Rating"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Blog Rating"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<BlogRatingGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<BlogRatingDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<BlogRatingGetDTO>>> list(BlogRatingCriteria criteria) {
        return service.list(criteria);
    }
}
