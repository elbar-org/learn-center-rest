package elbar.company.learn_center_rest.controller.blog.blog_comment;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.blog.blog_comment.BlogCommentCriteria;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentCreateDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentDetailDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentGetDTO;
import elbar.company.learn_center_rest.dto.blog.blog_comment.BlogCommentUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.blog.blog_comment.BlogCommentServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/blog_comment/*")
public class BlogCommentController extends AbstractController<BlogCommentServiceImpl> {
    public BlogCommentController(BlogCommentServiceImpl service) {
        super(service);
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<Data<Void>> create(@RequestBody BlogCommentCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @RequestMapping(value = "delete/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<Data<Void>> delete(@PathVariable UUID code) {
        return service.delete(code);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<Data<Void>> update(@RequestBody BlogCommentUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @RequestMapping(value = "detail/{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<BlogCommentDetailDTO>> getWithDetail(@PathVariable UUID code) {
        return service.detail(code);
    }

    @RequestMapping(value = "{code}", method = RequestMethod.GET)
    public ResponseEntity<Data<BlogCommentGetDTO>> get(@PathVariable UUID code) {
        return service.get(code);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<Data<List<BlogCommentGetDTO>>> getAll(@Valid BlogCommentCriteria criteria) {
        return service.list(criteria);
    }
}
