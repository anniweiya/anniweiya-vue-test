package cn.anniweiya.user.service.impl;

import cn.anniweiya.user.entity.SysUser;
import cn.anniweiya.user.mapper.SysUserMapper;
import cn.anniweiya.user.service.ISysUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-27
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {


    public SysUser selectOneByUsername(String username) {
        return this.selectOne(new EntityWrapper<SysUser>().eq("fusername", username));
    }
}
