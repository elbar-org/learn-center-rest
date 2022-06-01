package elbar.company.learn_center_rest.enums.blog.blog_category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BlogCategoryFieldsEnum {
    TITLE("title"),
    DESCRIPTION("description");

    private final String value;
}
