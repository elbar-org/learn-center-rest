package elbar.company.learn_center_rest.validator.auth.teacher;

import elbar.company.learn_center_rest.dto.auth.teacher.TeacherCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class TeacherValidator extends AbstractValidator<TeacherCreateDTO, TeacherUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TeacherCreateDTO teacherCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(teacherCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(TeacherUpdateDTO cd) throws InvalidValidationException {
        if (Objects.isNull(cd)) {
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
