package com.wj.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: wj_springBoot
 * @description: 测试运行
 * @author: wj
 * @create: 2021-09-13 15:35
 **/
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService bean = context.getBean(DemoAnnotationService.class);
        DemoMethodService bean1 = context.getBean(DemoMethodService.class);
        System.out.println("提交一行代码");
        bean.add();
        bean1.add1();
        context.close();

    }
}
