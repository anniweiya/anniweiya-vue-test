package cn.anniweiya.appserver.config;

import cn.anniweiya.appserver.security.permission.JwtMethodSecurityExpressionHandler;
import cn.anniweiya.appserver.security.permission.JwtPermissionEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/**
 * Created by anniweiya on 5/29/17.
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityMethodConfig extends GlobalMethodSecurityConfiguration {


    @Autowired
    private JwtMethodSecurityExpressionHandler expressionHandler;
    @Autowired
    private JwtPermissionEvaluator evaluator;

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        expressionHandler.setPermissionEvaluator(evaluator);
        return expressionHandler;
    }
}
