package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysUserRole;
import cn.anniweiya.system.mapper.SysUserRoleMapper;
import cn.anniweiya.system.service.ISysUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRolemapper;
}
