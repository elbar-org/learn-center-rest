package elbar.company.learn_center_rest.enums.auth.block_reason;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BlockReasonFieldsEnum {
    NAME("name");
    private final String value;
}
