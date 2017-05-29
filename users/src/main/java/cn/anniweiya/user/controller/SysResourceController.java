package cn.anniweiya.user.controller;

import cn.anniweiya.user.service.ISysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private ISysResourceService sysResourceservice;

    @RequestMapping(value="index")
    public void sysResource(){

    }

}
