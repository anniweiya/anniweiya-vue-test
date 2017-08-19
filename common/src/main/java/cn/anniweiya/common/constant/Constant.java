package cn.anniweiya.common.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="jwt")
@Component
public final class Constant {


    public static final String CLAIM_KEY_USERNAME = "sub";
    public static final String CLAIM_KEY_AUDIENCE = "audience";
    public static final String CLAIM_KEY_CREATED = "created";
    public static final String CLAIM_KEY_USERFID = "userFid";
    public static final String CLAIM_KEY_ROLEID = "roleFid";


    public static final String AUDIENCE_UNKNOWN = "unknown";
    public static final String AUDIENCE_WEB = "web";
    public static final String AUDIENCE_MOBILE = "mobile";
    public static final String AUDIENCE_TABLET = "tablet";

}
