package com.secondhand.car.trade.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.secondhand.car.trade.system.dao")
public class SecondHandCarTradeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondHandCarTradeSystemApplication.class, args);
    }

}
