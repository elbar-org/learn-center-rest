package elbar.company.learn_center_rest.repository.course.course_tag;

import elbar.company.learn_center_rest.entity.course.course_tag.CourseTag;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface CourseTagRepository extends JpaRepository<CourseTag, Integer>, BaseRepository {
    @Transactional
    @Modifying
    @Query(value = "delete from CourseTag where isDeleted = false and code = :code")
    void deleteByCode(UUID code);

    @Query(value = "from CourseTag where isDeleted = false and code = :code")
    CourseTag findByCode(UUID code);
}
