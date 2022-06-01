package elbar.company.learn_center_rest.controller.course.course_video;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.course.course_video.CourseVideoCriteria;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.course.course_video.CourseVideoServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/course-video/*")
public class CourseVideoControllerImpl extends AbstractController<CourseVideoServiceImpl> implements CourseVideoController {
    public CourseVideoControllerImpl(CourseVideoServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(CourseVideoCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Course Video"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(CourseVideoUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Course Video"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Course Video"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<CourseVideoDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<CourseVideoGetDTO>>> list(CourseVideoCriteria criteria) {
        return service.list(criteria);
    }
}
