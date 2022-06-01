package elbar.company.learn_center_rest.service.course.course_certificate_user;

import elbar.company.learn_center_rest.criteria.course.course_certificate_user.CourseCertificateUserCriteria;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserCreateDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserDetailDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserGetDTO;
import elbar.company.learn_center_rest.dto.course.course_certificate_user.CourseCertificateUserUpdateDTO;
import elbar.company.learn_center_rest.entity.course.course_certificate_user.CourseCertificateUser;
import elbar.company.learn_center_rest.mapper.course.course_certificate_user.CourseCertificateUserMapper;
import elbar.company.learn_center_rest.repository.course.course_certificate_user.CourseCertificateUserRepository;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.AbstractService;
import elbar.company.learn_center_rest.validator.course.course_certificate_user.CourseCertificateUserValidator;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@Transactional
public class CourseCertificateUserServiceImpl extends AbstractService<CourseCertificateUserValidator, CourseCertificateUserMapper, CourseCertificateUserRepository> implements CourseCertificateUserService {
    public CourseCertificateUserServiceImpl(CourseCertificateUserValidator validator, CourseCertificateUserMapper mapper, CourseCertificateUserRepository repository) {
        super(validator, mapper, repository);
    }

    @Override
    public ResponseEntity<Data<Void>> create(CourseCertificateUserCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        return new ResponseEntity<>(new Data<>(null), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<Void>> update(CourseCertificateUserUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        CourseCertificateUser user = repository.findByCode(DTO.getCode());
        if (Objects.isNull(user)) {
            throw new NotFoundException("Course certificate user not found");
        }
        user.setUserId(DTO.getUserId());
        user.setCertificateId(DTO.getCertificateId());
        repository.save(user);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<Void>> delete(UUID key) {
        validator.validateKey(key);
        CourseCertificateUser user = repository.findByCode(key);
        if (Objects.isNull(user)) {
            throw new NotFoundException("Course certificate user not found");
        }
        repository.deleteByCode(key);
        return new ResponseEntity<>(new Data<>(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseCertificateUserGetDTO>> get(UUID key) {
        validator.validateKey(key);
        CourseCertificateUser user = repository.findByCode(key);
        if (Objects.isNull(user)) {
            throw new NotFoundException("Course certificate user not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromGetDTO(user)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<CourseCertificateUserDetailDTO>> detail(UUID key) {
        validator.validateKey(key);
        CourseCertificateUser user = repository.findByCode(key);
        if (Objects.isNull(user)) {
            throw new NotFoundException("Course certificate user not found");
        }
        return new ResponseEntity<>(new Data<>(mapper.fromDetailDTO(user)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<CourseCertificateUserGetDTO>>> list(CourseCertificateUserCriteria criteria) {
        PageRequest request = PageRequest.of(criteria.getPage(), criteria.getSize());
        return new ResponseEntity<>(new Data<>(mapper.fromGetListDTO(repository.findAll(request).stream().toList()), repository.count()), HttpStatus.OK);
    }
}
