package elbar.company.learn_center_rest.entity.blog.blog;

import elbar.company.learn_center_rest.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blog", schema = "blog")
public class Blog extends Auditable {
    @Column(name = "title", nullable = false, length = 120)
    private String title;

    @Column(name = "description", nullable = false, length = 300)
    private String description;

    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    @Lob
    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(name = "is_published")
    private boolean isPublished;
}
