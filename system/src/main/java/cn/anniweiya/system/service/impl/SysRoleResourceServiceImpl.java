package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysRoleResource;
import cn.anniweiya.system.mapper.SysRoleResourceMapper;
import cn.anniweiya.system.service.ISysRoleResourceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@Service
public class SysRoleResourceServiceImpl extends ServiceImpl<SysRoleResourceMapper, SysRoleResource> implements ISysRoleResourceService {

    @Autowired
    private SysRoleResourceMapper sysRoleResourcemapper;
}
