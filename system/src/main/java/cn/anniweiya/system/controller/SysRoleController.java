package cn.anniweiya.system.controller;

import cn.anniweiya.system.service.ISysRoleService;
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
@RequestMapping(value = "/sysRole")
public class SysRoleController {
    @Resource
    private ISysRoleService sysRoleService;

    @RequestMapping(value = "index")
    public void sysRole() {

    }

}
