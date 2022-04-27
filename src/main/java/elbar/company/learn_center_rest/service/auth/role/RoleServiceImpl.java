package elbar.company.learn_center_rest.service.auth.role;

import elbar.company.learn_center_rest.criteria.auth.role.RoleCriteria;
import elbar.company.learn_center_rest.dto.auth.role.RoleCreateDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleDetailDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleGetDTO;
import elbar.company.learn_center_rest.dto.auth.role.RoleUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.language.Language;
import elbar.company.learn_center_rest.entity.auth.role.Role;
import elbar.company.learn_center_rest.mapper.auth.role.RoleMapper;
import elbar.company.learn_center_rest.repository.auth.role.RoleRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.auth.role.RoleValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RoleServiceImpl extends AbstractService<RoleValidator, RoleMapper, RoleRepository> implements RoleService {
    public RoleServiceImpl(RoleValidator validator, RoleMapper mapper, RoleRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(RoleCreateDTO DTO) {
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> update(RoleUpdateDTO DTO) {
       return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(true), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<RoleGetDTO>> get(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<RoleDetailDTO>> detail(UUID key) {
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(repository.getByCode(key))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<RoleGetDTO>>> list(RoleCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        Page<Role> all = repository.findAll(request);
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(all.toList()), all.getSize()), HttpStatus.OK);
    }
}
