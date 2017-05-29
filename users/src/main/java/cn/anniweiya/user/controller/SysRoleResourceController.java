package cn.anniweiya.user.controller;

import cn.anniweiya.user.service.ISysRoleResourceService;
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
@RequestMapping(value="/sysRoleResource")
public class SysRoleResourceController {
    @Autowired
    private ISysRoleResourceService sysRoleResourceservice;

    @RequestMapping(value="index")
    public void sysRoleResource(){

    }

}
