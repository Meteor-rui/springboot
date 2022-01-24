package com.mcy.springbootswagger;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2Doc
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringbootswaggerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootswaggerApplication.class, args);
    }

}
