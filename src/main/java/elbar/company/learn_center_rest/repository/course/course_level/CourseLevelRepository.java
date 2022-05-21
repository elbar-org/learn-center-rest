package elbar.company.learn_center_rest.repository.course.course_level;

import elbar.company.learn_center_rest.entity.course.course_level.CourseLevel;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface CourseLevelRepository extends JpaRepository<CourseLevel, Integer>, BaseRepository {
    @Transactional
    @Modifying
    @Query(value = "delete from CourseLevel where isDeleted = false and code = :code")
    void deleteByCode(UUID code);

    @Query(value = "from CourseLevel where isDeleted = false and code = :code")
    CourseLevel findByCode(UUID code);
}
