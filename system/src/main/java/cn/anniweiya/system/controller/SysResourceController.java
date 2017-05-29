package cn.anniweiya.system.controller;

import cn.anniweiya.system.service.ISysResourceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@RestController
@RequestMapping(value="/sysResource")
public class SysResourceController {
    @Resource
    private ISysResourceService sysResourceService;

    @RequestMapping(value="/index")
    public void sysResource(){

    }

}
