package elbar.company.learn_center_rest.controller;

import elbar.company.learn_center_rest.criteria.BaseCriteria;
import elbar.company.learn_center_rest.dto.GenericDTO;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

public interface GenericGLDController<GD extends GenericDTO, DD extends GenericDTO, CR extends BaseCriteria, K extends Serializable> {
    @RequestMapping(value = BaseUtils.GET_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<GD>> get(@PathVariable K code);

    @RequestMapping(value = BaseUtils.DETAIL_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<DD>> detail(@PathVariable K code);

    @RequestMapping(value = BaseUtils.LIST_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<List<GD>>> list(@Valid CR criteria);
}
