package elbar.company.learn_center_rest.utils.check;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckUtilsTest {

    @Test
    void checkAllFieldsObject() {
    }

    @Test
    void checkStringIsValid() {
        String str = "NIgga  s";
        if (StringUtils.isBlank(str) || StringUtils.isEmpty(str) || str.length() == 0 || StringUtils.containsAnyIgnoreCase(str, " ")) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}