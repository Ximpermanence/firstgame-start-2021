package cn.ch.firstgamestart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description: AOPconfig
 * @author: chenhao
 * @create:2020/8/19 13:54
 **/
@Configuration
@ComponentScan("cn.ch.firstgamestart.interceptor")
@EnableAspectJAutoProxy
public class AppConfig {
}
