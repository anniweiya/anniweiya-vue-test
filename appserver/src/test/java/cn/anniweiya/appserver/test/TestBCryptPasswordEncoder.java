package cn.anniweiya.appserver.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by anniweiya on 5/28/17.
 */
public class TestBCryptPasswordEncoder {



    public static void main(String[] args) {
        String password = "1234";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        password = passwordEncoder.encode(password);
        System.out.println(password);
    }
}
