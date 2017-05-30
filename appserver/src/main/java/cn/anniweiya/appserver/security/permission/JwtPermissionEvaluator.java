package cn.anniweiya.appserver.security.permission;

import cn.anniweiya.appserver.service.ISystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by anniweiya on 5/29/17.
 */
@Component
public class JwtPermissionEvaluator implements PermissionEvaluator {
    private Logger logger = LoggerFactory.getLogger(JwtPermissionEvaluator.class);
    @Resource
    private ISystemService systemService;

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
//        if ((authentication == null) || (targetDomainObject == null) || !(permission instanceof String)){
//            return false;
//        }
        logger.info(authentication.getAuthorities().toString());
        String userPermission = systemService.queryAllPermission(authentication.getName());
        if (userPermission.contains(permission.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType,
                                 Object permission) {
        if ((authentication == null) || (targetId == null) || !(permission instanceof String)){
            return false;
        }
        return false;
    }
}
