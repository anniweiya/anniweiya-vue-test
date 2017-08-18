package cn.anniweiya.appserver.security.service;

import cn.anniweiya.appserver.security.JwtUserFactory;
import cn.anniweiya.appserver.service.ISystemService;
import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userDetailsService")
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private ISystemService systemService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = systemService.queryUser(username);


        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            List<SysRole> sysRoleList = systemService.queryUserRole(user.getFid());
            return JwtUserFactory.create(user, sysRoleList);
        }
    }
}
