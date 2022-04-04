package elbar.company.learn_center_rest.service;

import elbar.company.learn_center_rest.dto.GenericDTO;
import elbar.company.learn_center_rest.response.Data;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface GenericGLDService<GD extends GenericDTO, DD extends GenericDTO, K extends Serializable> {
    ResponseEntity<Data<GD>> get(K key);

    ResponseEntity<Data<DD>> detail(K key);

    ResponseEntity<Data<List<GD>>> list();
}
