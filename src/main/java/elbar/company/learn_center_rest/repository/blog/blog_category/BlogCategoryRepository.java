package elbar.company.learn_center_rest.repository.blog.blog_category;

import elbar.company.learn_center_rest.entity.blog.blog_category.BlogCategory;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogCategoryRepository extends JpaRepository<BlogCategory, Integer>, BaseRepository {
}
