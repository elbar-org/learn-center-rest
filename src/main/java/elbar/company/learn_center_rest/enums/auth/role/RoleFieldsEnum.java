package elbar.company.learn_center_rest.enums.auth.role;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleFieldsEnum {
    NAME("name");

    private final String value;
}
