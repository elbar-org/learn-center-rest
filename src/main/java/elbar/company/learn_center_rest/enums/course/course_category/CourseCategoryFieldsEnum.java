package elbar.company.learn_center_rest.enums.course.course_category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CourseCategoryFieldsEnum {
    TITLE("title"),
    DESCRIPTION("description");

    private final String value;
}
