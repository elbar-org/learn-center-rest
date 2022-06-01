package elbar.company.learn_center_rest.enums.system.tag;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TagFieldsEnum {
    NAME("name");
    private final String value;
}
