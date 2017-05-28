package cn.anniweiya.user.mapper;

import cn.anniweiya.user.entity.SysRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-27
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> findByUserRole(@Param("userId")Integer userId);

    String findPermissions(long fid);
}