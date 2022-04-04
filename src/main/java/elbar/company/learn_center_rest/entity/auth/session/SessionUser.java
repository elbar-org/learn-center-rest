package elbar.company.learn_center_rest.entity.auth.session;

import elbar.company.learn_center_rest.entity.auth.user.AuthUser;
import elbar.company.learn_center_rest.service.auth.user.AuthUserServiceImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Getter
@Setter
@ToString
public class SessionUser implements UserDetails {
    private UUID code;
    private String username;
    private String password;
    private String email;
    private String image;
    private String language;
    private String status;
    private List<String> roles;

    public SessionUser(AuthUserServiceImpl service, AuthUser user) {
        code = user.getCode();
        username = user.getUsername();
        password = user.getPassword();
        email = user.getEmail();
        image = user.getImage();
        language = user.getLanguage();
        status = user.getStatus();
        roles = service.getRolesByCode(user.getCode());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        if (Objects.isNull(this.roles)) {
            return authorities;
        }
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
