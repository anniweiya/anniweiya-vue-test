package cn.anniweiya.appserver.config;

import cn.anniweiya.appserver.security.permission.JwtMethodSecurityExpressionHandler;
import cn.anniweiya.appserver.security.permission.JwtPermissionEvaluator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by anniweiya on 5/29/17.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Slf4j
public class WebSecurityMethodConfig extends GlobalMethodSecurityConfiguration {

    @Resource
    private JwtMethodSecurityExpressionHandler jwtMethodSecurityExpressionHandler;
    @Resource
    private JwtPermissionEvaluator jwtPermissionEvaluator;

    /**
     * in 1.5.3 spring boot
     * this method must be override, otherwise the createExpressionHandler will not be running
     * It's probably a bug or I have some trouble
     *
     * @param handlers
     */
    @Override
    public void setMethodSecurityExpressionHandler(List<MethodSecurityExpressionHandler> handlers) {
        super.setMethodSecurityExpressionHandler(handlers);
    }

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        log.info("MethodSecurityExpressionHandler createExpressionHandler ");
        jwtMethodSecurityExpressionHandler
                .setPermissionEvaluator(jwtPermissionEvaluator);
        return jwtMethodSecurityExpressionHandler;
    }

}
