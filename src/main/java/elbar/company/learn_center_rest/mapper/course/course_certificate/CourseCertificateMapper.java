package elbar.company.learn_center_rest.mapper.course.course_certificate;

import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateGetDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate.CourseCertificateUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_certificate.CourseCertificate;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseCertificateMapper extends GenericMapper<CourseCertificateCreateDTO, CourseCertificateUpdateDTO, CourseCertificateGetDTO, CourseCertificateDetailDTO, CourseCertificate> {
}
