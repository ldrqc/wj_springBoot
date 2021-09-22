package com.wj.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @program: wj_springBoot
 * @description: 方法式拦截AOP
 * @author: wj
 * @create: 2021-09-13 11:29
 **/
@Service
public class DemoMethodService {
    public void add1(){
        System.out.println("执行了方法的add1");
    }
}
