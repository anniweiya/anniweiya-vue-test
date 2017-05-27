package cn.anniweiya.appserver.security;

import cn.anniweiya.user.entity.SysUser;
import cn.anniweiya.user.service.impl.SysUserServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserServiceImpl sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = new SysUser();
        sysUser.setFname(username);
        SysUser user = this.sysUserService.selectOne(new EntityWrapper<>(sysUser));
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return create(user);
        }
    }

    public CerberusUser create(SysUser user) {
        Collection<? extends GrantedAuthority> authorities;
        try {
            authorities = AuthorityUtils.commaSeparatedStringToAuthorityList("USER");
        } catch (Exception e) {
            authorities = null;
        }
        return new CerberusUser(
                user.getFid().longValue(),
                user.getFname(),
                user.getFpassword(),
                user.getFname(),
                new Date(),
                authorities
        );
    }

}
