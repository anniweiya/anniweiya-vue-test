package cn.anniweiya.user.service.impl;

import cn.anniweiya.user.entity.SysRoleResource;
import cn.anniweiya.user.mapper.SysRoleResourceMapper;
import cn.anniweiya.user.service.ISysRoleResourceService;
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
