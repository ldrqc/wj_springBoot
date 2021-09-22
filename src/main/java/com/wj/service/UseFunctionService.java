package com.wj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: wj_springBoot
 * @description: useFunctionService
 * @author: wj
 * @create: 2021-09-08 16:08
 **/
@Service
public class UseFunctionService {

    @Autowired
    FunctionService functionService;

    public String sayHelloWord(String word){
        return functionService.sayHelloWord(word);
    }
}
