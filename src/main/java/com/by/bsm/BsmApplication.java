package com.by.bsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.by.bsm.system.mapper","com.by.bsm.mapper.system"})
public class BsmApplication {

    public static void main(String[] args) {
        //dddd
        SpringApplication.run(BsmApplication.class, args);
    }

}
