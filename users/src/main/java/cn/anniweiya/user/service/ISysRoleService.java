package cn.anniweiya.user.service;

import cn.anniweiya.user.entity.SysRole;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
public interface ISysRoleService extends IService<SysRole> {

    List<SysRole> findByUserRole(Integer userId);

}
