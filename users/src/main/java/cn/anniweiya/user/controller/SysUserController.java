package cn.anniweiya.user.controller;

import cn.anniweiya.user.entity.SysUser;
import cn.anniweiya.user.service.impl.SysUserServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-26
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private SysUserServiceImpl sysUserService;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser() {
        Page<SysUser> sysUserPage = sysUserService.selectPage(new Page<>(0, 3));
        System.out.println(sysUserPage.getRecords());
        return sysUserPage.getRecords().toString();
    }

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }
}
