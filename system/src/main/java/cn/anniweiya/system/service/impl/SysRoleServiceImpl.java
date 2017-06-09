package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.mapper.SysRoleMapper;
import cn.anniweiya.system.service.ISysRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service(value = "sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> queryUserRole(Integer userId) {
        return sysRoleMapper.queryUserRole(userId);
    }
}
