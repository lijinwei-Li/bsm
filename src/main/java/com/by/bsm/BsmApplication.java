package com.by.bsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.by.bsm.system.mapper")
public class BsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsmApplication.class, args);
    }

}
