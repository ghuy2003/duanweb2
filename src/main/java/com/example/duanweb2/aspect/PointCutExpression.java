package com.example.duanweb2.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointCutExpression {

    //declare Poincuts that match packages
    @Pointcut("execution(* com.example.duanweb2.controller.*.*(..))")
    public void controllerPackage(){}
    @Pointcut("execution(* com.example.duanweb2.dao.*.*(..))")
    public void daoPackage(){}
    @Pointcut("execution(* com.example.duanweb2.service.*.*(..))")
    public void servicePackage(){}

    @Pointcut("controllerPackage() || daoPackage() || servicePackage()")
    public void appFlow(){}

}
