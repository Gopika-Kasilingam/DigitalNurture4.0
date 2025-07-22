package com.example.Code.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.example.Code.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object returnValue = joinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("[LOG] Execution time of " + joinPoint.getSignature() + ": " + (end - start) + " ms");

        return returnValue;
    }
}
