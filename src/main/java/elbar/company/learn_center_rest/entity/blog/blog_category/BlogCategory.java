package elbar.company.learn_center_rest.entity.blog.blog_category;

import elbar.company.learn_center_rest.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blog_category", schema = "blog")
public class BlogCategory extends Auditable {
    @Column(name = "title", nullable = false, length = 120)
    private String title;

    @Column(name = "description", nullable = false, length = 300)
    private String description;

    @Column(name = "is_published")
    private boolean isPublished;
}
