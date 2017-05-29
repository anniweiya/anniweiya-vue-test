package cn.anniweiya.system.service;

import cn.anniweiya.system.entity.SysUser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * query a user by username
     * @param username
     * @return
     */
    SysUser queryUser(String username);
}
