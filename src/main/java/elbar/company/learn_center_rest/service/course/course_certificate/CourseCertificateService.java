package elbar.company.learn_center_rest.service.course.course_certificate;

import elbar.company.learn_center_rest.criteria.course.course_certificate.CourseCertificateCriteria;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateGetDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface CourseCertificateService extends GenericCUDService<CourseCertificateCreateDTO, CourseCertificateUpdateDTO, UUID>, GenericGLDService<CourseCertificateGetDTO, CourseCertificateDetailDTO, CourseCertificateCriteria, UUID> {
}
