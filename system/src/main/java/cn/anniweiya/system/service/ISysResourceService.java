package cn.anniweiya.system.service;

import cn.anniweiya.system.entity.SysResource;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
public interface ISysResourceService extends IService<SysResource> {

    /**
     * query all permission by userid
     * @param userId
     * @return
     */
    String queryAllPermission(Integer userId);

    /**
     * query all permission by username
     * @param username
     * @return
     */
    String queryAllPermission(String username);
}
