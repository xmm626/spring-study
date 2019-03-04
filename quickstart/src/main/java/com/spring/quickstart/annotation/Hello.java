package com.spring.quickstart.annotation;

import org.springframework.stereotype.Component;

/*
* 采用注解开发的Bean
* component用于类级别注解，标注本类为一个可被Spring容器托管的bean
* */
@Component("hello")
public class Hello {
    public String getHello(){
        return "Hello World";
    }

}
