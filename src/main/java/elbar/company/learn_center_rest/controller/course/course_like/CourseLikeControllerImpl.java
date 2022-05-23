package elbar.company.learn_center_rest.controller.course.course_like;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.course.course_like.CourseLikeCriteria;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeGetDTO;
import elbar.company.learn_center_rest.dto.course.course_like.CourseLikeUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.course.course_like.CourseLikeServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/course-like/*")
public class CourseLikeControllerImpl extends AbstractController<CourseLikeServiceImpl> implements CourseLikeController {
    public CourseLikeControllerImpl(CourseLikeServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(CourseLikeCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Course Like"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(CourseLikeUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Course Like"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Course Like"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseLikeGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<CourseLikeDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<CourseLikeGetDTO>>> list(CourseLikeCriteria criteria) {
        return service.list(criteria);
    }
}
