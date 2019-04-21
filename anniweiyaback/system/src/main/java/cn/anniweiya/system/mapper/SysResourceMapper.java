package cn.anniweiya.system.mapper;

import cn.anniweiya.system.entity.SysResource;
import cn.anniweiya.system.po.SysResourcePO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Component("sysResourcemapper")
public interface SysResourceMapper extends BaseMapper<SysResource> {

    /**
     * query permissionCode by roleId
     * @param roleId
     * @return
     */
    Set<String> queryPermissionCode(Integer roleId);


    @Select("queryResourceList")
    List<SysResourcePO> queryResourceList(Map<String, Object> params);
}