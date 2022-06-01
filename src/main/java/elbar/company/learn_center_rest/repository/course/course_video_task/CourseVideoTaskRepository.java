package elbar.company.learn_center_rest.repository.course.course_video_task;

import elbar.company.learn_center_rest.entity.course.course_video_task.CourseVideoTask;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface CourseVideoTaskRepository extends JpaRepository<CourseVideoTask, Integer>, BaseRepository {
    @Transactional
    @Modifying
    @Query(value = "delete from CourseVideoTask where isDeleted = false and code = :code")
    void deleteByCode(UUID code);

    @Query(value = "from CourseVideoTask where isDeleted = false and code = :code")
    CourseVideoTask findByCode(UUID code);
}
