package cn.anniweiya.appserver;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anniweiya on 5/26/17.
 */
@ComponentScan(basePackages = "cn.anniweiya")
@MapperScan("cn.anniweiya.*")
@EnableAutoConfiguration
@SpringBootApplication
@Slf4j
@RestController
public class Application {


    public static void main(String[] args) {
        log.info("Application start !");
        SpringApplication.run(Application.class, args);
    }
}
