package elbar.company.learn_center_rest.criteria;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GenericCriteria implements BaseCriteria {
    private Integer size;
    private Integer page;

    public Integer getPage() {
        if (Objects.isNull(page))
            page = 0;
        return page;
    }

    public Integer getSize() {
        if (Objects.isNull(size))
            size = 10;
        return size;
    }
}
