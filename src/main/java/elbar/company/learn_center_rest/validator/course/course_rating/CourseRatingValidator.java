package elbar.company.learn_center_rest.validator.course.course_rating;

import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_rating.CourseRatingUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CourseRatingValidator extends AbstractValidator<CourseRatingCreateDTO, CourseRatingUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CourseRatingCreateDTO courseRatingCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseRatingCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(CourseRatingUpdateDTO courseRatingUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseRatingUpdateDTO)) {
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
