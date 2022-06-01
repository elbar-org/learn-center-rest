package elbar.company.learn_center_rest.validator.course.course_video_task;

import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_video_task.CourseVideoTaskUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CourseVideoTaskValidator extends AbstractValidator<CourseVideoTaskCreateDTO, CourseVideoTaskUpdateDTO, UUID> {
    @Override
    public void validOnCreate(CourseVideoTaskCreateDTO courseVideoTaskCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseVideoTaskCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(CourseVideoTaskUpdateDTO courseVideoTaskUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(courseVideoTaskUpdateDTO)) {
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
