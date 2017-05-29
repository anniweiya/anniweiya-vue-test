package cn.anniweiya.appserver.config;

import cn.anniweiya.appserver.security.permission.JwtMethodSecurityExpressionHandler;
import cn.anniweiya.appserver.security.permission.JwtPermissionEvaluator;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

import javax.annotation.Resource;

/**
 * Created by anniweiya on 5/29/17.
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityMethodConfig extends GlobalMethodSecurityConfiguration {


    @Resource
    private JwtMethodSecurityExpressionHandler expressionHandler;
    @Resource
    private JwtPermissionEvaluator evaluator;

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        expressionHandler.setPermissionEvaluator(evaluator);
        return expressionHandler;
    }
}
