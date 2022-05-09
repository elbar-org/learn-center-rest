package elbar.company.learn_center_rest.repository.blog.blog_like;

import elbar.company.learn_center_rest.entity.blog.blog_comment.BlogComment;
import elbar.company.learn_center_rest.entity.blog.blog_like.BlogLike;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface BlogLikeRepository extends JpaRepository<BlogLike, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    BlogLike getByCode(UUID code);
}
