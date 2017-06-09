package cn.anniweiya.appserver.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class CorsFilter implements Filter {
    @Value("${jwt.header}")
    private String tokenHeader;

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
                                                                                            ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers",
                           "Origin, X-Requested-With, Content-Type, Accept, " + tokenHeader);
        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
        log.info(" CorsFilter init ");
    }

    public void destroy() {
    }

}
