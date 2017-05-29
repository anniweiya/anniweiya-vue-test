package cn.anniweiya.appserver.test.sys;

import cn.anniweiya.appserver.Application;
import cn.anniweiya.system.service.ISysResourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by anniweiya on 5/29/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestSysResource {
    @Resource
    private ISysResourceService sysResourceService;

    @Test
    public void testQueryAllPermission() {
        String s = sysResourceService.queryAllPermission(1);
        System.out.println(s);
        assertThat(s, notNullValue());
    }
}
