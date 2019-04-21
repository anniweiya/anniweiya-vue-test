package cn.anniweiya.appserver.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by anniweiya on 5/28/17.
 */
@Slf4j
public class TestBCryptPasswordEncoder {


    public static void main(String[] args) {
        String password = "1234";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        password = passwordEncoder.encode(password);
        log.info(password);
    }
}
