package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysResource;
import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.mapper.SysResourceMapper;
import cn.anniweiya.system.mapper.SysRoleMapper;
import cn.anniweiya.system.mapper.SysUserMapper;
import cn.anniweiya.system.service.ISysResourceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service(value = "sysResourceService")
public class SysResourceServiceImpl extends ServiceImpl<SysResourceMapper, SysResource> implements ISysResourceService {

    @Resource
    private SysResourceMapper sysResourcemapper;
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public String queryAllPermission(Integer userId) {
        List<SysRole> sysRoles = sysRoleMapper.queryUserRole(userId);
        Set<String> result = new HashSet<>();
        for (SysRole sysRole : sysRoles) {
            Integer sysRoleFid = sysRole.getFid();
            result.addAll(sysResourcemapper.queryResource(sysRoleFid));
        }
        return result.toString();
    }

    @Override
    public String queryAllPermission(String username) {
        return this.queryAllPermission(sysUserMapper.queryUser(username));
    }
}
