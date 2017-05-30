package cn.anniweiya.system.controller;

import cn.anniweiya.system.service.ISysResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@RestController
@RequestMapping(value = "/sysResource")
public class SysResourceController {
    private Logger logger = LoggerFactory.getLogger(SysResourceController.class);


    @Resource
    private ISysResourceService sysResourceService;

    @PreAuthorize("hasPermission(#hello, 'sys:system:select')")
    @RequestMapping(value = "/index")
    public void sysResource(String hello) {
        logger.info("WebSecurityMethodConfig");
    }

    @RequestMapping(value = "/index1")
    public void sysResource() {
        logger.info("sysResource1");
    }
}
