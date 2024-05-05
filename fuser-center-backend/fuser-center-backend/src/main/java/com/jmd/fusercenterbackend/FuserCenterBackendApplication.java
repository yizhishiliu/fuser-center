package com.jmd.fusercenterbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jmd.fusercenterbackend.mapper")
public class FuserCenterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuserCenterBackendApplication.class, args);
    }

}
