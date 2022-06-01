package elbar.company.learn_center_rest.enums.blog.blog;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BlogFieldsEnum {
    TITLE("title"),
    DESCRIPTION("description"),
    CONTENT("content");

    private final String value;
}
