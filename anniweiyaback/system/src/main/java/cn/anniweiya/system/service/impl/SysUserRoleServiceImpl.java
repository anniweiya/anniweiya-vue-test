package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysUserRole;
import cn.anniweiya.system.mapper.SysUserRoleMapper;
import cn.anniweiya.system.service.ISysUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service(value = "sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

    @Resource
    private SysUserRoleMapper sysUserRolemapper;
}
