package com.wj.service;

import org.springframework.stereotype.Service;

/**
 * @program: wj_springBoot
 * @description: functionService
 * @author: wj
 * @create: 2021-09-08 16:06
 **/
@Service
public class FunctionService {
    public String sayHelloWord(String word){
        return "hello Word! "+word;
    }
}
