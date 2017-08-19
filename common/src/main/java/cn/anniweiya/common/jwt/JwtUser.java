package cn.anniweiya.common.jwt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.Set;


public class JwtUser implements UserDetails {

    private static final long serialVersionUID = -2765457223272144948L;
    private final Long id;
    private final String username;
    private final String firstname;
    private final String lastname;
    private final String password;
    private final String email;
    private final Set<Integer> roleId;
    private final Collection<? extends GrantedAuthority> authorities;
    private final boolean enabled;
    private final Date lastPasswordResetDate;


    public JwtUser(
            Long id,
            Set<Integer> roleId,
            String username,
            String firstname,
            String lastname,
            String email,
            String password,
            Collection<? extends GrantedAuthority> authorities,
            boolean enabled,
            Date lastPasswordResetDate
    ) {
        this.id = id;
        this.roleId = roleId;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
        this.enabled = enabled;
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Set<Integer> getRoleId() {
        return roleId;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @JsonIgnore
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }


    public static final class JwtUserBuilder {
        private Long id;
        private String username;
        private String firstname;
        private String lastname;
        private String password;
        private String email;
        private Set<Integer> roleId;
        private Collection<? extends GrantedAuthority> authorities;
        private boolean enabled;
        private Date lastPasswordResetDate;

        private JwtUserBuilder() {
        }

        public static JwtUserBuilder aJwtUser() {
            return new JwtUserBuilder();
        }

        public JwtUserBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public JwtUserBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public JwtUserBuilder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public JwtUserBuilder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public JwtUserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public JwtUserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public JwtUserBuilder withRoleId(Set<Integer> roleId) {
            this.roleId = roleId;
            return this;
        }

        public JwtUserBuilder withAuthorities(Collection<? extends GrantedAuthority> authorities) {
            this.authorities = authorities;
            return this;
        }

        public JwtUserBuilder withEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public JwtUserBuilder withLastPasswordResetDate(Date lastPasswordResetDate) {
            this.lastPasswordResetDate = lastPasswordResetDate;
            return this;
        }

        public JwtUser build() {
            return new JwtUser(id, roleId, username, firstname, lastname, email, password, authorities, enabled,
                               lastPasswordResetDate);
        }
    }

    @Override
    public String toString() {
        return "JwtUser{" +
               "id=" + id +
               ", username='" + username + '\'' +
               ", firstname='" + firstname + '\'' +
               ", lastname='" + lastname + '\'' +
               ", password='" + password + '\'' +
               ", email='" + email + '\'' +
               ", roleId=" + roleId +
               ", authorities=" + authorities +
               ", enabled=" + enabled +
               ", lastPasswordResetDate=" + lastPasswordResetDate +
               '}';
    }
}
