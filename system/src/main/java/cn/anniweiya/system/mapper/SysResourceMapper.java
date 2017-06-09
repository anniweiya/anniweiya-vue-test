package cn.anniweiya.system.mapper;

import cn.anniweiya.system.entity.SysResource;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.Set;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
public interface SysResourceMapper extends BaseMapper<SysResource> {

    Set<String> queryResource(Integer roleId);

}