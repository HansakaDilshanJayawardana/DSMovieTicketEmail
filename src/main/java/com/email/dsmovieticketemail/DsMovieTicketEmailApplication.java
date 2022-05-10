package com.email.dsmovieticketemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class DsMovieTicketEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsMovieTicketEmailApplication.class, args);
    }

}
