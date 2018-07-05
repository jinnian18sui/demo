package demo.springboot.chapter2springbootconfig;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 */
@EnableSwagger2Doc      //开启swagger
@SpringBootApplication
public class Chapter2SpringBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter2SpringBootConfigApplication.class, args);
    }
}
