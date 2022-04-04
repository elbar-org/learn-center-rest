package elbar.company.learn_center_rest.utils;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.client.RestTemplate;

@Getter
@Setter
public class BaseUtils {
    public static final String API = "/api";
    public static final String VERSION = "/v1";
    public static final String PATH = API + VERSION;
    public static final Gson GSON = new Gson();
    public static final RestTemplate TEMPLATE = new RestTemplate();
}
