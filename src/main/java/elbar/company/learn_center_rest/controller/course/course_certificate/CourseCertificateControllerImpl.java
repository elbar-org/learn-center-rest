package elbar.company.learn_center_rest.controller.course.course_certificate;

import elbar.company.learn_center_rest.controller.AbstractController;
import elbar.company.learn_center_rest.criteria.course.course_certificate.CourseCertificateCriteria;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateGetDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateUpdateDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.course.course_certificate.CourseCertificateServiceImpl;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/course-certificate/*")
public class CourseCertificateControllerImpl extends AbstractController<CourseCertificateServiceImpl> implements CourseCertificateController {
    public CourseCertificateControllerImpl(CourseCertificateServiceImpl service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(CourseCertificateCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully created - Course Certificate"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(CourseCertificateUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully updated - Course Certificate"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully deleted - Course Certificate"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseCertificateGetDTO>> get(UUID code) {
        return service.get(code);
    }

    @Override
    public ResponseEntity<Data<CourseCertificateDetailDTO>> detail(UUID code) {
        return service.detail(code);
    }

    @Override
    public ResponseEntity<Data<List<CourseCertificateGetDTO>>> list(CourseCertificateCriteria criteria) {
        return service.list(criteria);
    }
}
