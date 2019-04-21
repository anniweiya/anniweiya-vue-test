package cn.anniweiya.system.mapper;

import cn.anniweiya.system.entity.SysRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Component("sysRoleMapper")
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> queryUserRole(@Param("userId") Integer userId);

}