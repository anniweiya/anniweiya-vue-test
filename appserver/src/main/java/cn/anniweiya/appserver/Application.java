package cn.anniweiya.appserver;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by anniweiya on 5/26/17.
 */
@ComponentScan(basePackages = "cn.anniweiya")
@MapperScan("cn.anniweiya.*")
@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Application start !");
        SpringApplication.run(Application.class, args);
    }
}
