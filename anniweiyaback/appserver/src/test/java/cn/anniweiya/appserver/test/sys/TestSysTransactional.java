package cn.anniweiya.appserver.test.sys;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

@Slf4j
public class TestSysTransactional extends AbstractTestTemplate{
    @Override
    protected String getRequestParams() {
        return "";
    }

    @Override
    protected String getRequestUrl() {
        return "/sysResource/testTransactional";
    }

    @Override
    protected void handleResult(ResponseEntity<String> result) {
        log.info(result.getBody());
    }
}
