package cn.anniweiya.system.mapper;

import cn.anniweiya.system.entity.SysRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> queryUserRole(@Param("userId") Integer userId);

}