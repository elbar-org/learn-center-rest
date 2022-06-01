package elbar.company.learn_center_rest.repository.course.course_certificate_user;

import elbar.company.learn_center_rest.entity.course.course_certificate_user.CourseCertificateUser;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface CourseCertificateUserRepository extends JpaRepository<CourseCertificateUser, Integer>, BaseRepository {
    @Transactional
    @Modifying
    @Query(value = "delete from CourseCertificateUser where isDeleted = false and code = :code")
    void deleteByCode(UUID code);

    @Query(value = "from CourseCertificateUser where isDeleted = false and code = :code")
    CourseCertificateUser findByCode(UUID code);
}
