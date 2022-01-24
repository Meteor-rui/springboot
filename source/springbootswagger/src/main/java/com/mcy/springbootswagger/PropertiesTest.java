package com.mcy.springbootswagger;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
@SpringBootTest
public class PropertiesTest {
    @Value("${spring.datasource.password:}")
    private String password;

    @Test
    public void test(){
    System.out.println(password);
        log.info("spring.datasource.password : {}", password);
    }
}
