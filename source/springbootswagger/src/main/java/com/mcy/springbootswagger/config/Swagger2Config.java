package com.mcy.springbootswagger.config;
import com.spring4all.swagger.EnableSwagger2Doc;
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
 * swagger2配置项
 *
 */
@Configuration
@EnableSwagger2Doc
public class Swagger2Config {

    /**
     * 注入一个Springfox framework主要的构建器Docket进入Spring容器
     *
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // API基础信息
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mcy.springbootswagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title("SpringBoot使用Swagger2")
                //服务条款URL
                .termsOfServiceUrl("http://localhost:8082/")
                // 版本号
                .version("1.0.0")
                // 描述
                .description("生活百般滋味，人生需要笑对")
                .build();
    }
}