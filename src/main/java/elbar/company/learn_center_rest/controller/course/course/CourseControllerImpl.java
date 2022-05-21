package elbar.company.learn_center_rest.controller.course.course;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.course.course.CourseCriteria;
import elbar.company.learn_center_rest.dto.course.course.CourseCreateDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseDetailDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseGetDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.course.course.CourseServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/course/*")
public class CourseControllerImpl extends AbstractController<CourseServiceImpl> implements CourseController {
    public CourseControllerImpl(CourseServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(CourseCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Course"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(CourseUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Course"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Course"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<CourseDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<CourseGetDTO>>> list(CourseCriteria criteria) {
        return service.list(criteria);
    }
}
