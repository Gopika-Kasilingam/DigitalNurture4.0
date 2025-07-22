package com.example.Code.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

public class LoggingAspect {

    @Before("execution(* com.example.Code.service.BookService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("⏱ Before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.example.Code.service.BookService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("✅ After method: " + joinPoint.getSignature().getName());
    }
}
