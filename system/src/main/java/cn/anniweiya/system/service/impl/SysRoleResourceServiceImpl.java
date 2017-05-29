package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysRoleResource;
import cn.anniweiya.system.mapper.SysRoleResourceMapper;
import cn.anniweiya.system.service.ISysRoleResourceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service(value = "sysRoleResourceService")
public class SysRoleResourceServiceImpl extends ServiceImpl<SysRoleResourceMapper, SysRoleResource> implements ISysRoleResourceService {

    @Resource
    private SysRoleResourceMapper sysRoleResourcemapper;
}
