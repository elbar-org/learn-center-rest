package elbar.company.learn_center_rest.validator.course.course_tag;

import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_tag.CourseTagUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CourseTagValidator extends AbstractValidator<CourseTagCreateDTO, CourseTagUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CourseTagCreateDTO courseTagCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseTagCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(CourseTagUpdateDTO courseTagUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseTagUpdateDTO)) {
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
