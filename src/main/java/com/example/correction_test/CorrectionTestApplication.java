package com.example.correction_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CorrectionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorrectionTestApplication.class, args);
    }

}
