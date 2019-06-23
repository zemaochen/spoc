package com.cdu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cdu.dao")
public class spocApp {
    public static void main(String[] args) {
        SpringApplication.run(spocApp.class,args);
    }
}
