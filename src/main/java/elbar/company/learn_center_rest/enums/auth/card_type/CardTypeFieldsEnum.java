package elbar.company.learn_center_rest.enums.auth.card_type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CardTypeFieldsEnum {
    NAME("name");
    private final String value;
}
