package cn.anniweiya.user.controller;

import cn.anniweiya.user.entity.SysUser;
import cn.anniweiya.user.service.impl.SysUserServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-26
 */
@RestController
public class SysUserController {
    @Autowired
    private SysUserServiceImpl sysUserService;

    @RequestMapping(value="/api/getUser")
    public String getUser() {
        Page<SysUser> sysUserPage = sysUserService.selectPage(new Page<>(0, 3));
        System.out.println(sysUserPage.getRecords());
        return sysUserPage.getRecords().toString();
    }

    @RequestMapping(value="/api/test")
    public String test() {
        System.out.println("hello world");
        return "hello world";
    }
}
