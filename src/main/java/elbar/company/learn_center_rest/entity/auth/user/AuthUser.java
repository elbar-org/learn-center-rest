package elbar.company.learn_center_rest.entity.auth.user;

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
@Table(name = "auth_user", schema = "auth")
public class AuthUser extends Auditable {
    @Column(name = "username", nullable = false, unique = true, length = 120)
    private String username;

    @Column(name = "password", nullable = false, length = 300)
    private String password;

    @Column(name = "email", nullable = false, unique = true, length = 120)
    private String email;

    @Lob
    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "language", nullable = false, length = 120)
    private String language;

    @Column(name = "status", nullable = false, length = 120)
    private String status;
}
