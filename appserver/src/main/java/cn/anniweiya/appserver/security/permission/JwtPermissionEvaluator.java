package cn.anniweiya.appserver.security.permission;

import cn.anniweiya.user.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by anniweiya on 5/29/17.
 */
@Component
public class JwtPermissionEvaluator implements PermissionEvaluator {

    @Autowired
    private SysUserServiceImpl userService;

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        if ((authentication == null) || (targetDomainObject == null) || !(permission instanceof String)){
            return false;
        }
        String name = authentication.getName();

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
