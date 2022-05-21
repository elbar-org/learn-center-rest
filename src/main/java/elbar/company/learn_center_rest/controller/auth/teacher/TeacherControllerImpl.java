package elbar.company.learn_center_rest.controller.auth.teacher;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.auth.teacher.TeacherCriteria;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherDetailDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherGetDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.teacher.TeacherServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/teacher/*")
public class TeacherControllerImpl extends AbstractController<TeacherServiceImpl> implements TeacherController {
    public TeacherControllerImpl(TeacherServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(TeacherCreateDTO DTO) {
        return new ResponseEntity<>(new Data<>("Successfully created - Teacher"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(TeacherUpdateDTO DTO) {
        return new ResponseEntity<>(new Data<>("Successfully updated - Teacher"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        return new ResponseEntity<>(new Data<>("Successfully deleted - Teacher"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TeacherGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<TeacherDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<TeacherGetDTO>>> list(TeacherCriteria criteria) {
        return service.list(criteria);
    }
}
