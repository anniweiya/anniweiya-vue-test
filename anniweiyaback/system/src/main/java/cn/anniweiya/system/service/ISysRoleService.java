package cn.anniweiya.system.service;

import cn.anniweiya.system.entity.SysRole;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
public interface ISysRoleService extends IService<SysRole> {

    /**
     * query user's role by userid
     *
     * @param userId
     *
     * @return
     */
    List<SysRole> queryUserRole(Integer userId);


}
