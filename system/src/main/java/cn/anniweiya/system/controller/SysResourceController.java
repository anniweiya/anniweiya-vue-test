package cn.anniweiya.system.controller;

import cn.anniweiya.system.entity.SysResource;
import cn.anniweiya.system.service.ISysResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author anniweiya
 * @since 2017-05-29
 */
@RestController
@RequestMapping(value = "/sysResource")
@Api("sys resource")
@Slf4j
public class SysResourceController {


    @Resource
    private ISysResourceService sysResourceService;

    @RequestMapping(value = "/index")
    @ApiOperation("test for index")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "hello", value = "hello", required = false, dataType = "String")
    })
    public ResponseEntity index(String hello) {
        return ResponseEntity.ok("hello from server, 200 ");
    }

    @PreAuthorize("hasPermission(#hello, 'sys:user:select')")
    @RequestMapping(value = "/hasPermission1")
    public ResponseEntity hasPermission1(String hello) {
        return ResponseEntity.ok("hello from server, test has permission 1");
    }

    @PreAuthorize("hasPermission(#hello, 'hello', 'sys:user:select')")
    @RequestMapping(value = "/hasPermission2")
    public ResponseEntity hasPermission2(String hello) {
        return ResponseEntity.ok("hello from server, test has permission 2");
    }

    @RequestMapping(value = "/testTransactional")
    public ResponseEntity<String> testTransactional(String hello) {
        SysResource sysResource = new SysResource();
        sysResource.setFname("test");
        sysResource.setFcode("test");
        sysResource.setFisDelete(0);
        sysResource.setFcreateTime(new Date());
        sysResourceService.insertSysResource(sysResource);
        return ResponseEntity.ok("hello from server, 200 ");
    }
}
