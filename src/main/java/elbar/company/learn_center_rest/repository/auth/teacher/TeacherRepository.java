package elbar.company.learn_center_rest.repository.auth.teacher;

import elbar.company.learn_center_rest.entity.auth.teacher.Teacher;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>, BaseRepository {

    @Transactional
    void deleteByCode(UUID key);

    Optional<Teacher> getByCode(UUID code);
}
