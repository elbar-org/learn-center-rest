package elbar.company.learn_center_rest.validator.course.course;

import elbar.company.learn_center_rest.dto.course.course.CourseCreateDTO;
import elbar.company.learn_center_rest.dto.course.course.CourseUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CourseValidator extends AbstractValidator<CourseCreateDTO, CourseUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CourseCreateDTO courseCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(CourseUpdateDTO courseUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseUpdateDTO)) {
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
