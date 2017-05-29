package cn.anniweiya.system.service.impl;

import cn.anniweiya.system.entity.SysResource;
import cn.anniweiya.system.mapper.SysResourceMapper;
import cn.anniweiya.system.service.ISysResourceService;
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
public class SysResourceServiceImpl extends ServiceImpl<SysResourceMapper, SysResource> implements ISysResourceService {

    @Autowired
    private SysResourceMapper sysResourcemapper;
}
