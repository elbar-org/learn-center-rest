package elbar.company.learn_center_rest.validator.auth.teacher;

import elbar.company.learn_center_rest.dto.auth.teacher.TeacherCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher.TeacherUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TeacherValidator extends AbstractValidator<TeacherCreateDTO, TeacherUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TeacherCreateDTO teacherCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(TeacherUpdateDTO cd) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
