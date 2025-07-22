package com.example.Code.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.example.Code.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object value = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("[LOG] " + joinPoint.getSignature() + " executed in " + (end - start) + "ms");
        return value;
    }
}
