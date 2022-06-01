package elbar.company.learn_center_rest.validator.course.course_certificate_user;

import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CourseCertificateUserValidator extends AbstractValidator<CourseCertificateUserCreateDTO, CourseCertificateUserUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CourseCertificateUserCreateDTO courseCertificateUserCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseCertificateUserCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(CourseCertificateUserUpdateDTO courseCertificateUserUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseCertificateUserUpdateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (Objects.isNull(id)) {
            throw new InvalidValidationException("ID is null");
        }
    }
}
