package elbar.company.learn_center_rest.validator.auth.teacher_skills;

import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsCreateDTO;
import elbar.company.learn_center_rest.dto.auth.teacher_skills.TeacherSkillsUpdateDTO;
import elbar.company.learn_center_rest.exception.exception.InvalidValidationException;
import elbar.company.learn_center_rest.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class TeacherSkillsValidator extends AbstractValidator<TeacherSkillsCreateDTO, TeacherSkillsUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TeacherSkillsCreateDTO teacherSkillsCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(teacherSkillsCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(TeacherSkillsUpdateDTO cd) throws InvalidValidationException {
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
