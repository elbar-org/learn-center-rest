package elbar.company.learn_center_rest.validator.course.course_video_source_code;

import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_source_code.CourseVideoSourceCodeUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CourseVideoSourceCodeValidator extends AbstractValidator<CourseVideoSourceCodeCreateDTO, CourseVideoSourceCodeUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CourseVideoSourceCodeCreateDTO courseVideoSourceCodeCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseVideoSourceCodeCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(CourseVideoSourceCodeUpdateDTO courseVideoSourceCodeUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseVideoSourceCodeUpdateDTO)) {
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
