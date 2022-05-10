package elbar.company.learn_center_rest.repository.blog.blog_rating;

import elbar.company.learn_center_rest.entity.blog.blog_like.BlogLike;
import elbar.company.learn_center_rest.entity.blog.blog_rating.BlogRating;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface BlogRatingRepository extends JpaRepository<BlogRating, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    BlogRating getByCode(UUID code);
}
