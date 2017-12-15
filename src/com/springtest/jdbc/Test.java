package com.springtest.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        IUserDao dao = ctx.getBean("userDao2",UserDaoImpl.class);

        dao.add(new User("任小龙"));
    }
}
