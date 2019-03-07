package com.spring;
/*
* 用户自定义的前置增强
* */
public class MyBeforeAdvice {
    //定义迁至方法
    public void beforeMethod(){
        System.out.println("this is a before method");
    }
}
