package cn.ch.firstgamestart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ch.firstgamestart.mapper")
public class FirstgameStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstgameStartApplication.class, args);
    }

}
