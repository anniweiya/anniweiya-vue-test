package cn.anniweiya.appserver.test.sys;

import cn.anniweiya.appserver.security.JwtAuthenticationRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by anniweiya on 6/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestSpringBootTestRestTemplate {


    @Autowired
    private TestRestTemplate restTemplate;
    protected HttpHeaders httpHeaders = new HttpHeaders();
    private String token;


    @Before
    public void before() throws IOException {
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");
        restTemplate.withBasicAuth("admin", "1234");
        JwtAuthenticationRequest request = new JwtAuthenticationRequest();
        request.setPassword("1234");
        request.setUsername("admin");
        HttpEntity entity = new HttpEntity<>(request, httpHeaders);
        ResponseEntity<?> exchange = restTemplate.exchange("/auth", HttpMethod.POST, entity, String.class);
    }

    @Test
    public void getToken() {

        System.out.println(token);
    }

    @Test
    public void exampleTest() {
        ResponseEntity<String> forEntity =
                this.restTemplate.getForEntity("/sysResource/testTransactional", String.class);
        assertThat(forEntity).isEqualTo("Hello World");
    }

}

