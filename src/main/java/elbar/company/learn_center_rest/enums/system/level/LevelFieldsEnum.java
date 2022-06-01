package elbar.company.learn_center_rest.enums.system.level;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LevelFieldsEnum {
    NAME("name");

    private final String value;
}
