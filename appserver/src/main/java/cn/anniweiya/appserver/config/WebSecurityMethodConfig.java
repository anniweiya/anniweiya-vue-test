package cn.anniweiya.appserver.config;

import cn.anniweiya.appserver.security.permission.JwtMethodSecurityExpressionHandler;
import cn.anniweiya.appserver.security.permission.JwtPermissionEvaluator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.annotation.Resource;

/**
 * Created by anniweiya on 5/29/17.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityMethodConfig extends GlobalMethodSecurityConfiguration {
    private Logger logger = LoggerFactory.getLogger(WebSecurityMethodConfig.class);

    @Resource
    private JwtMethodSecurityExpressionHandler expressionHandler;
    @Resource
    private JwtPermissionEvaluator evaluator;

    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        logger.info("MethodSecurityExpressionHandler");

        expressionHandler.setPermissionEvaluator(evaluator);
        return expressionHandler;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        logger.info("WebSecurityMethodConfig configure");
        logger.info(auth.toString());
        super.configure(auth);
    }

    public WebSecurityMethodConfig() {
        logger.info("WebSecurityMethodConfig");
    }
}
