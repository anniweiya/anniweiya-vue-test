package cn.anniweiya.appserver.test.sys;

import cn.anniweiya.appserver.Application;
import cn.anniweiya.appserver.service.ISystemService;
import cn.anniweiya.system.entity.SysRole;
import cn.anniweiya.system.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by anniweiya on 5/29/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class TestSystemService {
    @Resource
    private ISystemService systemService;


    @Test
    public void testQueryAllPermissionByusername() {
        String s = systemService.queryAllPermission("admin");
        log.info(s);
        assertThat(s, notNullValue());
    }

    @Test
    public void testfindByUserRole() {
        List<SysRole> role = systemService.queryUserRole(1);
        log.info(role.toString());

        assertThat(role.get(0).getFid().toString(), notNullValue());
    }

    @Test
    public void testfindqueryUser() {
        SysUser amdin = systemService.queryUser("admin");
        log.info(amdin.toString());
        assertThat(amdin.getFid().toString(), notNullValue());
    }

}
