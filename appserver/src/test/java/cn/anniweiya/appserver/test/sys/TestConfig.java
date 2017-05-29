package cn.anniweiya.appserver.test.sys;

import cn.anniweiya.appserver.Application;
import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;
import cn.anniweiya.system.service.ISysRoleService;
import cn.anniweiya.system.service.ISysUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


/**
 * Created by anniweiya on 5/28/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestConfig {

    @Resource
    private ISysUserService sysUserService;
    @Resource
    private ISysRoleService sysRoleService;

    @Test
    public void testHelloWorld() {
        SysUser user = sysUserService.selectOne(new EntityWrapper<SysUser>().eq("fusername", "1234"));
        boolean a = false;
        boolean b = false;
        System.out.println(user);
        assertThat(a, equalTo(b));
        assertThat(user.getFid().toString(), containsString("1"));
    }

    @Test
    public void testfindByUserRole() {
        List<SysRole> role = sysRoleService.queryUserRole(1);

        System.out.println(role);
        assertThat(role.get(0).getFid().toString(), notNullValue());

    }

}
