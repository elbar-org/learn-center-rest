package elbar.company.learn_center_rest.validator.course.course_video;

import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video.CourseVideoUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CourseVideoValidator extends AbstractValidator<CourseVideoCreateDTO, CourseVideoUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CourseVideoCreateDTO courseVideoCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseVideoCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(CourseVideoUpdateDTO courseVideoUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseVideoUpdateDTO)) {
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
