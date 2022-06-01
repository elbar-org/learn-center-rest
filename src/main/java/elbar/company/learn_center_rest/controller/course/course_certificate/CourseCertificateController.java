package elbar.company.learn_center_rest.controller.course.course_certificate;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.course.course_certificate.CourseCertificateCriteria;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateGetDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateUpdateDTO;

import java.util.UUID;

public interface CourseCertificateController extends GenericCUDController<CourseCertificateCreateDTO, CourseCertificateUpdateDTO, UUID>, GenericGLDController<CourseCertificateGetDTO, CourseCertificateDetailDTO, CourseCertificateCriteria, UUID> {
}
