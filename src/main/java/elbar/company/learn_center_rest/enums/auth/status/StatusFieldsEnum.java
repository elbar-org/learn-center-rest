package elbar.company.learn_center_rest.enums.auth.status;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StatusFieldsEnum {
    NAME("name");

    private final String value;
}
