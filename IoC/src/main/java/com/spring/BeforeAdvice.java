package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(UserDAO.class);

    public void userMethod(){
        logger.info("连接数据库。。。");
    }
}
