package elbar.company.learn_center_rest.entity.blog.blog_rating;

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
@Table(name = "blog_rating", schema = "blog")
public class BlogRating extends Auditable {
    @Column(name = "blog_id", nullable = false, updatable = false)
    private Integer blogId;

    @Column(name = "views", nullable = false)
    private Integer views;

    @Column(name = "stars", nullable = false)
    private Integer stars;
}
