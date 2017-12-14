package com.springtest.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Performer performer = (Performer) ctx.getBean("drama");
        performer.perform();
        System.out.println("=============================================");
        performer.speak();
    }
}
