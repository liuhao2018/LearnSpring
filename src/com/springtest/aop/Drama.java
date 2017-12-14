package com.springtest.aop;

public class Drama implements Performer {
    @Override
    public void perform() {
        System.out.println("话剧正在表演");
    }

    @Override
    public void speak() {
        System.out.println("演讲");
    }
}
