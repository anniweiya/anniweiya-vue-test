package cn.anniweiya.user.service.impl;

import cn.anniweiya.user.entity.SysRole;
import cn.anniweiya.user.mapper.SysRoleMapper;
import cn.anniweiya.user.service.ISysRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> findByUserRole(Integer userId) {
        return sysRoleMapper.findByUserRole(userId);
    }
}
