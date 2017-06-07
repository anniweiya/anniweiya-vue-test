package cn.anniweiya.system.service;

import cn.anniweiya.system.entity.SysResource;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Transactional
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


    Integer insertSysResource(SysResource sysResource);

    Integer insertSysResourceTestTransactional(SysResource sysResource);
}
