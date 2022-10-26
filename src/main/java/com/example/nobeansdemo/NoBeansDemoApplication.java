package com.example.nobeansdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class NoBeansDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoBeansDemoApplication.class, args);
    }

}
