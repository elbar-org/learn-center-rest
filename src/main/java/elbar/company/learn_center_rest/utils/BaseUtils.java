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
    public static final String CREATE_PATH = "create";
    public static final String UPDATE_PATH = "update";
    public static final String DELETE_PATH = "delete/{code}";
    public static final String GET_PATH = "get/{code}";
    public static final String DETAIL_PATH = "detail/{code}";
    public static final String LIST_PATH = "list";
}
