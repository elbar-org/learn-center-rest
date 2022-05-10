package elbar.company.learn_center_rest.repository.blog.blog_tag;

import elbar.company.learn_center_rest.entity.blog.blog_like.BlogLike;
import elbar.company.learn_center_rest.entity.blog.blog_tag.BlogTag;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface BlogTagRepository extends JpaRepository<BlogTag, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    BlogTag getByCode(UUID code);
}
