package com.springtest.aop;

public class Audience {
    private void takeSeats() {
        System.out.println("观众入座");
    }

    private void turnOffCellPhones(){
        System.out.println("观众关机或静音");
    }

    private void applaud() {
        System.out.println("观众鼓掌");
    }

    private void demandRefund() {
        System.out.println("一点都不好看，我们要求退钱");
    }
}
