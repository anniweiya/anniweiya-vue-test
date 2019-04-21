package cn.anniweiya.appserver.security.permission;

import cn.anniweiya.appserver.service.ISystemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by anniweiya on 5/29/17.
 */
@Component
@Slf4j
public class JwtPermissionEvaluator implements PermissionEvaluator {
    @Resource
    private ISystemService systemService;

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        //do not verify the null object, because the OPTIONS requests will send with null object
//        if ((authentication == null) || (targetDomainObject == null) || (permission == null)) {
//            logger.info("PermissionEvaluator hasPermission----fail");
//            return false;
//        }
        if (hasPermission(authentication, permission)) {
            return true;
        }
        return false;
    }

    private boolean hasPermission(Authentication authentication, Object permission) {
        log.info("username:" + authentication.getName() + ", role:" + authentication.getAuthorities().toString());
        String userPermission = systemService.queryAllPermission(authentication.getName());
        if (userPermission.contains(permission.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType,
                                 Object permission) {
        if (hasPermission(authentication, permission)) {
            return true;
        }
        return false;
    }
}
