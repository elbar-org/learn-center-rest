package elbar.company.learn_center_rest.entity.blog.blog_comment;

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
@Table(name = "blog_comment", schema = "blog")
public class BlogComment extends Auditable {
    @Column(name = "blog_id", nullable = false)
    private Integer blogId;

    @Column(name = "message", length = 150)
    private String message;
}
