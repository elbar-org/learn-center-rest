package elbar.company.learn_center_rest.enums.course.course_price;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CoursePriceFieldsEnum {
    PRICE("price");

    private final String value;
}
