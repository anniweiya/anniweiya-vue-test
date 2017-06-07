package cn.anniweiya.appserver.config;

import cn.anniweiya.appserver.security.permission.JwtMethodSecurityExpressionHandler;
import cn.anniweiya.appserver.security.permission.JwtPermissionEvaluator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class WebSecurityMethodConfig extends GlobalMethodSecurityConfiguration {
    private Logger logger = LoggerFactory.getLogger(WebSecurityMethodConfig.class);

    @Resource
    private JwtMethodSecurityExpressionHandler jwtMethodSecurityExpressionHandler;
    @Resource
    private JwtPermissionEvaluator jwtPermissionEvaluator;

    /**
     * in 1.5.3 spring boot
     * this method must be override, otherwise the createExpressionHandler will not be running
     * It's probably a bug or I have some trouble
     * @param handlers
     */
    @Override
    public void setMethodSecurityExpressionHandler(List<MethodSecurityExpressionHandler> handlers) {
        super.setMethodSecurityExpressionHandler(handlers);
    }

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        logger.info("MethodSecurityExpressionHandler createExpressionHandler ");
        jwtMethodSecurityExpressionHandler
                .setPermissionEvaluator(jwtPermissionEvaluator);
        return jwtMethodSecurityExpressionHandler;
    }

}
