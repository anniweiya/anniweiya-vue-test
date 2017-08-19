package cn.anniweiya.appserver.security;

import cn.anniweiya.common.jwt.JwtUser;
import cn.anniweiya.common.jwt.JwtUser.JwtUserBuilder;
import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(SysUser user, List<SysRole> roleList) {
        return JwtUserBuilder.aJwtUser()
                             .withId(user.getFid().longValue())
                             .withUsername(user.getFusername())
                             .withFirstname(user.getFfirstname())
                             .withLastname(user.getFlastname())
                             .withEmail(user.getFemail())
                             .withPassword(user.getFpassword())
                             .withAuthorities(mapToGrantedAuthorities(roleList))
                             .withEnabled(user.getFenabled())
                             .withLastPasswordResetDate(user.getFlastpasswordResetDate())
                             .withRoleId(getRoleId(roleList))
                             .build();
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<SysRole> authorities) {
        return authorities.stream()
                          .map(authority -> new SimpleGrantedAuthority(authority.getFcode()))
                          .collect(Collectors.toList());
    }


    public static Set<Integer> getRoleId(List<SysRole> roleList) {
        return roleList.stream().map(SysRole::getFid).collect(Collectors.toSet());
    }
}
