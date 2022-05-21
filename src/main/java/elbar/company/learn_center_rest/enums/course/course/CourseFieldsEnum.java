package elbar.company.learn_center_rest.enums.course.course;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CourseFieldsEnum {
    TITLE("title"),
    DESCRIPTION("description");

    private final String value;
}
