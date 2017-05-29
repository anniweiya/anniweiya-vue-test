package cn.anniweiya.user.service.impl;

import cn.anniweiya.user.entity.SysResource;
import cn.anniweiya.user.mapper.SysResourceMapper;
import cn.anniweiya.user.service.ISysResourceService;
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
