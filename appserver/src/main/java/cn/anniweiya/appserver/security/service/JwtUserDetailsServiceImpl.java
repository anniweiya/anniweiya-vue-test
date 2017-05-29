package cn.anniweiya.appserver.security.service;

import cn.anniweiya.appserver.security.JwtUserFactory;
import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;
import cn.anniweiya.system.service.ISysRoleService;
import cn.anniweiya.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ISysUserService userService;
    @Autowired
    private ISysRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userService.selectOneByUsername(username);


        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            List<SysRole> sysRoleList = roleService.findByUserRole(user.getFid());
            return JwtUserFactory.create(user, sysRoleList);
        }
    }
}
