package com.wj.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: wj_springBoot
 * @description: 切面
 * @author: wj
 * @create: 2021-09-13 13:48
 **/
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.wj.ch1.aop.Action)")
    public void annotationPointCut(){
        System.out.println("我先执行才行");
    }

    @Before("execution(* com.wj.ch1.aop.DemoMethodService.*(..))")
    public void Before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截后边： "+method.getName());
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式拦截前边： "+annotation.name());
    }


}
