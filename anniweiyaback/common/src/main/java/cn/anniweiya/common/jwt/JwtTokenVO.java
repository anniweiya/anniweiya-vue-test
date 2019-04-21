package cn.anniweiya.common.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static cn.anniweiya.common.constant.Constant.CLAIM_KEY_ROLEID;
import static cn.anniweiya.common.constant.Constant.CLAIM_KEY_USERFID;

@Slf4j
@Component
public class JwtTokenVO {

    @Value("${jwt.header}")
    private String header;
    @Value("${jwt.secret}")
    private String secret;
    private Claims claims;

    public Claims getClaims() {
        if (claims != null) {
            return claims;
        }

        String authToken = getHeaderToken();
        return getClaims(authToken);
    }

    private Claims getClaims(String authToken) {
        try {
            claims = Jwts.parser()
                         .setSigningKey(secret)
                         .parseClaimsJws(authToken)
                         .getBody();
        } catch (Exception e) {
            claims = null;
            log.info("JwtTokenVO getClaims error!!!! ", e);
        }
        return claims;
    }

    private String getHeaderToken() {
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request.getHeader(this.header);
    }


    public Integer getUserId() {
        return (Integer) getClaims().get(CLAIM_KEY_USERFID);
    }

    public List<Integer> getRoleId() {
        return (List<Integer>) getClaims().get(CLAIM_KEY_ROLEID);
    }

}
