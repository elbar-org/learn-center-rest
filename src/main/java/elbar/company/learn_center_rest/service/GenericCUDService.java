package elbar.company.learn_center_rest.service;

import elbar.company.learn_center_rest.dto.BaseDTO;
import elbar.company.learn_center_rest.dto.GenericDTO;
import elbar.company.learn_center_rest.response.Data;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public interface GenericCUDService<CD extends BaseDTO, UD extends GenericDTO, K extends Serializable> {
    ResponseEntity<Data<Void>> create(CD DTO);

    ResponseEntity<Data<Void>> update(UD DTO);

    ResponseEntity<Data<Void>> delete(K key);
}
