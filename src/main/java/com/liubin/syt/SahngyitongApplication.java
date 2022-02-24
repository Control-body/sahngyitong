package com.liubin.syt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liubin.syt.mapper")
public class SahngyitongApplication {

    public static void main(String[] args) {
        SpringApplication.run(SahngyitongApplication.class, args);
    }

}
