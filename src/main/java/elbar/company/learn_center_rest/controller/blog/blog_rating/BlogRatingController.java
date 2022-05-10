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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/blog_rating/*")
public class BlogRatingController extends AbstractController<BlogRatingServiceImpl> {
    public BlogRatingController(BlogRatingServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody BlogRatingCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<Data<Void>> update(@RequestBody BlogRatingUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<BlogRatingDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<BlogRatingGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<BlogRatingGetDTO>>> getAll(@Valid BlogRatingCriteria criteria) {
        return service.list(criteria);
    }
}
