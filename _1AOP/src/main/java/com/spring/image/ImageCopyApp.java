package com.spring.image;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ImageCopyApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/spr.xml");
        ImageCopy imageCopy=context.getBean(ImageCopy.class);
        try {
            imageCopy.copyImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
