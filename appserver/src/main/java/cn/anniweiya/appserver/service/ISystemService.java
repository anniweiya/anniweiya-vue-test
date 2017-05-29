package cn.anniweiya.appserver.service;

import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;

import java.util.List;

/**
 * Created by anniweiya on 5/29/17.
 * appserver gets outside data interface
 */
public interface ISystemService {


    /**
     * query all permission by username
     * @param username
     * @return
     */
    String queryAllPermission(String username);

    /**
     * query a user by username
     * @param username
     * @return
     */
    SysUser queryUser(String username);

    /**
     * query user's role by userid
     * @param userId
     * @return
     */
    List<SysRole> queryUserRole(Integer userId);
}
