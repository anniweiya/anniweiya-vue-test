package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysUser;
import cn.anniweiya.system.mapper.SysUserMapper;
import cn.anniweiya.system.service.ISysUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service(value = "sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Resource
    private SysUserMapper sysUsermapper;

    public SysUser queryUser(String username) {
        return this.selectOne(new EntityWrapper<SysUser>().eq("fusername", username));
    }
}
