package cn.anniweiya.appserver.security;

import cn.anniweiya.user.entity.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.List;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(SysUser user) {
        return new JwtUser(
                user.getFid().longValue(),
                user.getFusername(),
                user.getFfirstname(),
                user.getFlastname(),
                user.getFemail(),
                user.getFpassword(),
                mapToGrantedAuthorities(user),
//                user.getFenabled(),
                true,
                user.getFlastpasswordResetDate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(SysUser authorities) {

        return Arrays.asList(new SimpleGrantedAuthority("admin"));
//        return authorities.stream()
//                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
//                .collect(Collectors.toList());
    }
}
