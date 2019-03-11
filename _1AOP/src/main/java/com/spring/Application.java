package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context=new ClassPathXmlApplicationContext("/spr.xml");
        Tiger tiger=context.getBean(Tiger.class);
        tiger.walk();
    }
}
