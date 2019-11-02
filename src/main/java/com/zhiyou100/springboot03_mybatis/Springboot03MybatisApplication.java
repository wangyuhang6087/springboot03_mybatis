package com.zhiyou100.springboot03_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhiyou100.springboot03_mybatis.mapper")
@SpringBootApplication
public class Springboot03MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03MybatisApplication.class, args);
    }

}
