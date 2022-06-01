package elbar.company.learn_center_rest.repository.course.course_video_materials;

import elbar.company.learn_center_rest.entity.course.course_video_materials.CourseVideoMaterials;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface CourseVideoMaterialsRepository extends JpaRepository<CourseVideoMaterials, Integer>, BaseRepository {
    @Transactional
    @Modifying
    @Query(value = "delete from CourseVideoMaterials where isDeleted = false and code = :code")
    void deleteByCode(UUID code);

    @Query(value = "from CourseVideoMaterials where isDeleted = false and code = :code")
    CourseVideoMaterials findByCode(UUID code);
}
