package elbar.company.learn_center_rest.enums.auth.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AuthUserFieldsEnum {
    USERNAME("username"),
    EMAIL("email"),
    LANGUAGE("language");
    private final String value;
}
