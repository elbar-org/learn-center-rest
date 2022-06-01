package elbar.company.learn_center_rest.repository.blog.blog;

import elbar.company.learn_center_rest.entity.blog.blog.Blog;
import elbar.company.learn_center_rest.entity.system.faq.Faq;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    Optional<Blog> getByCode(UUID code);
}
