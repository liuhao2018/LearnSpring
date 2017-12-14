package com.springtest.proxy.dynamic;

public class RealHello implements Hello {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
