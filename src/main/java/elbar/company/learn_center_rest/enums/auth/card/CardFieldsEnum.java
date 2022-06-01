package elbar.company.learn_center_rest.enums.auth.card;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CardFieldsEnum {
    HOLDER_NAME("holder_name");
    private final String value;
}
