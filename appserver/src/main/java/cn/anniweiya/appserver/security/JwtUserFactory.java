package cn.anniweiya.appserver.security;

import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(SysUser user, List<SysRole> roleList) {
        return new JwtUser(
                user.getFid().longValue(),
                user.getFusername(),
                user.getFfirstname(),
                user.getFlastname(),
                user.getFemail(),
                user.getFpassword(),
                mapToGrantedAuthorities(roleList),
                user.getFenabled(),
                user.getFlastpasswordResetDate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<SysRole> authorities) {
        return authorities.stream()
                          .map(authority -> new SimpleGrantedAuthority(authority.getFcode()))
                          .collect(Collectors.toList());
    }
}
