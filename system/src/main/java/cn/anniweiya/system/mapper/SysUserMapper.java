package cn.anniweiya.system.mapper;

import cn.anniweiya.system.entity.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * query user by username
     * @param username
     * @return user's primary key 'fid'
     */
    Integer queryUser(@Param("username")String username);

    SysUser queryUser1(@Param("username") String username);

}