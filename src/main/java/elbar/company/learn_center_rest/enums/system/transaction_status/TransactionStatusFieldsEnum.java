package elbar.company.learn_center_rest.enums.system.transaction_status;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TransactionStatusFieldsEnum {
    NAME("name");

    private final String value;
}
