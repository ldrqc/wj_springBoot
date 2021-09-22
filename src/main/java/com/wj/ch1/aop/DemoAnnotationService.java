package com.wj.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @program: wj_springBoot
 * @description: 注解拦截AOP
 * @author: wj
 * @create: 2021-09-13 11:27
 **/
@Service
public class DemoAnnotationService {

    @Action(name="注解试拦截的ADD操作")
    public void add(){
        System.out.println("执行了注解的add方法");
    }
}
