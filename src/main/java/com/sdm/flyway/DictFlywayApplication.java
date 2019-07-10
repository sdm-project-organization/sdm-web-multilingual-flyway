package com.sdm.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DictFlywayApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DictFlywayApplication.class, args);
    }

}
