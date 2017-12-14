package com.springtest.ioc_and_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserAction userAction = context.getBean("loginAction",UserAction.class);

        userAction.save();
    }
}
