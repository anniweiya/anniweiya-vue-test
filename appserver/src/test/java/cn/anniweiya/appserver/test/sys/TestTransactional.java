package cn.anniweiya.appserver.test.sys;

import cn.anniweiya.appserver.Application;
import cn.anniweiya.system.entity.SysResource;
import cn.anniweiya.system.service.ISysResourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by anniweiya on 6/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestTransactional {

    @Resource
    private ISysResourceService sysResourceService;

    @Test
    public void testTransactional() {
        SysResource sysResource = new SysResource();
        sysResource.setFname("test");
        sysResource.setFcode("test");
        sysResource.setFisDelete(0);
        sysResource.setFcreateTime(new Date());
        sysResourceService.insertSysResourceTestTransactional(sysResource);
    }


}
