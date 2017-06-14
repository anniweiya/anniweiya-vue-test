package cn.anniweiya.appserver.security.controller;

import cn.anniweiya.appserver.security.JwtTokenUtil;
import cn.anniweiya.appserver.security.JwtUser;
import cn.anniweiya.common.util.http.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class UserRestController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Resource
    private UserDetailsService userDetailsService;

    @RequestMapping(value = "user")
    public ResponseEntity<?> getAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return ResponseEntity.ok(Result.success(user));
    }

}
