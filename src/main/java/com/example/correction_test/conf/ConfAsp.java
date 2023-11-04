package com.example.correction_test.conf;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
@Slf4j
public class ConfAsp {

    @Before("execution(* com.example.correction_test.service.*.get*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {

        log.info("la date est " + new Date() );
    }
}
