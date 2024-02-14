package com.nhnacademy.edu.springframework.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {
    @Bean(name = "dbms")
    public String dbms() {
        System.out.println("dbms called!!");
        return new String("MYSQL");
    }
}
