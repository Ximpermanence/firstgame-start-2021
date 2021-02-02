package cn.ch.firstgamestart.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description: swagger配置
 * @author: chenhao
 * @create:2021/1/15 10:12
 **/
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig {

    /**
     * 默认分组1
     *
     * @return
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("基本信息")
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("cn.ch.firstgamestart.controller"))
                .paths(PathSelectors.any())
                .build();

    }


    /**
     * apiInfo
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("firstgame接口文档")
                .contact(new Contact("ch", "", ""))
                .version("1.0")
                .build();
    }
}
