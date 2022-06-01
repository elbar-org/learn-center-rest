package elbar.company.learn_center_rest.enums.auth.language;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LanguageFieldsEnum {
    NAME("name");
    private final String value;
}
