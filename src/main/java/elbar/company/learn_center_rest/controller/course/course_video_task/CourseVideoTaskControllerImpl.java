package elbar.company.learn_center_rest.controller.course.course_video_task;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.course.course_video_task.CourseVideoTaskCriteria;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskGetDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.course.course_video_task.CourseVideoTaskServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/course-video-task/*")
public class CourseVideoTaskControllerImpl extends AbstractController<CourseVideoTaskServiceImpl> implements CourseVideoTaskController {
    public CourseVideoTaskControllerImpl(CourseVideoTaskServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(CourseVideoTaskCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Course Video Task"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(CourseVideoTaskUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Course Video Task"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Course Video Task"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseVideoTaskGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<CourseVideoTaskDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<CourseVideoTaskGetDTO>>> list(CourseVideoTaskCriteria criteria) {
        return service.list(criteria);
    }
}
