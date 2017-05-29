package cn.anniweiya.appserver.service.impl;

import cn.anniweiya.appserver.service.ISystemService;
import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;
import cn.anniweiya.system.service.ISysResourceService;
import cn.anniweiya.system.service.ISysRoleService;
import cn.anniweiya.system.service.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by anniweiya on 5/29/17.
 */
@Service("systemService")
public class SystemServiceImpl implements ISystemService {

    @Resource
    private ISysResourceService sysResourceService;
    @Resource
    private ISysUserService sysUserService;
    @Resource
    private ISysRoleService sysRoleService;

    @Override
    public String queryAllPermission(String username) {
        return sysResourceService.queryAllPermission(username);
    }

    @Override
    public SysUser queryUser(String username) {
        return sysUserService.queryUser(username);
    }

    @Override
    public List<SysRole> queryUserRole(Integer userId) {
        return sysRoleService.queryUserRole(userId);
    }
}
