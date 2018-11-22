package com.next.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wxs
 * @date 2018.11.22
 */
@EnableAsync
@SpringBootApplication
@ComponentScan(basePackages ={"com.next.demo"})
@MapperScan("com.next.demo.mapper")
@EnableTransactionManagement
@EnableScheduling
public class NextApplication {

    public static void main(String[] args) {
        SpringApplication.run(NextApplication.class, args);
    }
}
