package elbar.company.learn_center_rest.repository.course.course_price;

import elbar.company.learn_center_rest.entity.course.course_price.CoursePrice;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface CoursePriceRepository extends JpaRepository<CoursePrice, Integer>, BaseRepository {
    @Transactional
    @Modifying
    @Query(value = "delete from CoursePrice where isDeleted = false and code = :code")
    void deleteByCode(UUID code);

    @Query(value = "from CoursePrice where isDeleted = false and code = :code")
    CoursePrice findByCode(UUID code);
}
