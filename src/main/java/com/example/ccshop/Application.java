package com.example.ccshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by litiancui on 18/1/8.
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.ccshop.domain"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
