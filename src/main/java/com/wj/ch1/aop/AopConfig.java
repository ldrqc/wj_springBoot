package com.wj.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: wj_springBoot
 * @description: AOP配置类
 * @author: wj
 * @create: 2021-09-13 15:33
 **/

@Configuration
@ComponentScan("com.wj.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
