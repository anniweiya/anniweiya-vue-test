package cn.anniweiya.system.controller;

import cn.anniweiya.system.service.ISysUserRoleService;
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
@RequestMapping(value="/sysUserRole")
public class SysUserRoleController {
    @Autowired
    private ISysUserRoleService sysUserRoleservice;

    @RequestMapping(value="index")
    public void sysUserRole(){

    }

}
