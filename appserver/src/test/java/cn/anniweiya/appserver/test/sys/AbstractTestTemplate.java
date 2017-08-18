package cn.anniweiya.appserver.test.sys;

import cn.anniweiya.appserver.security.JwtAuthenticationRequest;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by anniweiya on 6/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Slf4j
public abstract class AbstractTestTemplate<T> {

    @Value("${jwt.header}")
    private String tokenHeader;
    @Autowired
    private TestRestTemplate restTemplate;
    private final HttpHeaders httpHeaders = new HttpHeaders();
    private String token;
    private HttpEntity<Object> entity;

    @Before
    public void before() throws IOException, JSONException {
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");
        restTemplate.withBasicAuth("admin", "1234");
        JwtAuthenticationRequest request = new JwtAuthenticationRequest();
        request.setPassword("1234");
        request.setUsername("admin");
        entity = new HttpEntity<>(request, httpHeaders);
        ResponseEntity<String> exchange = restTemplate.exchange("/auth", HttpMethod.POST, entity, String.class);
        JSONObject jsonObject = new JSONObject(exchange.getBody());
        token = jsonObject.getString("token");
        log.info(token);
    }

    @Test
    public void test() {
        httpHeaders.add(tokenHeader, token);
        entity = new HttpEntity<>(getRequestParams(), httpHeaders);
        ResponseEntity<String> forEntity = this.restTemplate.exchange(getRequestUrl(), HttpMethod.POST, entity, String.class);
        handleResult(forEntity);
    }

    protected abstract T getRequestParams();
    protected abstract String getRequestUrl();
    protected abstract void handleResult(ResponseEntity<String> result);

}

