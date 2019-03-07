package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*
* 用户自定义的前置增强
* */
public class MyBeforeAdvice {
  private static final Logger logger= LoggerFactory.getLogger(Hello.class);
    //定义迁至方法
   public void beforeMethod(){
       /*logger.info("this is a before method");
        logger.debug("this is a before 456");*/
       System.out.println("this is a before method");
    }

}
