package com.springtest.ioc_and_di.ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        LoginAction loginAction =  context.getBean("loginAction", LoginAction.class);

        loginAction.login();
    }
}
