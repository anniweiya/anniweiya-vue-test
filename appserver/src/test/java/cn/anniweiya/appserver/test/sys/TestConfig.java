package cn.anniweiya.appserver.test.sys;

import cn.anniweiya.appserver.Application;
import cn.anniweiya.user.entity.SysRole;
import cn.anniweiya.user.entity.SysUser;
import cn.anniweiya.user.mapper.SysRoleMapper;
import cn.anniweiya.user.service.ISysRoleService;
import cn.anniweiya.user.service.ISysUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


/**
 * Created by anniweiya on 5/28/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestConfig {

    @Autowired
    private ISysUserService userService;
    @Autowired
    private ISysRoleService roleService;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void testHelloWorld() {
        SysUser user = userService.selectOne(new EntityWrapper<SysUser>().eq("fusername", "1234"));
        boolean a = false;
        boolean b = false;
        System.out.println(user);
        assertThat(a, equalTo(b));
        assertThat(user.getFid().toString(), containsString("1"));
    }

    @Test
    public void testfindByUserRole() {
        List<SysRole> role = roleService.findByUserRole(1);

        System.out.println(role);
        assertThat(role.get(0).getFid().toString(), notNullValue());

    }

    @Test
    public void testSysRoleMapper() {
        String permissions = sysRoleMapper.findPermissions(1);
        System.out.println(permissions);
    }
}
