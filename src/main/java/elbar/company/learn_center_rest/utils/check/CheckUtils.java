package elbar.company.learn_center_rest.utils.check;

import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Stream;

@Component
public class CheckUtils {

    @SneakyThrows
    public Boolean checkAllFieldsObject(Object o) {
        return Stream.of(o.getClass().getDeclaredFields()).anyMatch(Objects::isNull);
    }

    public Boolean UsernameIsValid(String str) {
        return !StringUtils.isBlank(str) || StringUtils.isEmpty(str) || str.length() == 0 || StringUtils.containsAnyIgnoreCase(str, " ");
    }
}
