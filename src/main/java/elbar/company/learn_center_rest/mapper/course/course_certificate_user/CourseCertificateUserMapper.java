package elbar.company.learn_center_rest.mapper.course.course_certificate_user;

import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserGetDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_certificate_user.CourseCertificateUser;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CourseCertificateUserMapper extends GenericMapper<CourseCertificateUserCreateDTO, CourseCertificateUserUpdateDTO, CourseCertificateUserGetDTO, CourseCertificateUserDetailDTO, CourseCertificateUser> {
}
