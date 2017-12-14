package com.springtest.proxy.dynamic;


import java.lang.reflect.Proxy;


public class JDKDynamicProxyTest {
    public static void main(String[] args) {

        MyHandler handler = new MyHandler(new RealHello());
        Hello proxy = (Hello) Proxy.newProxyInstance(
                JDKDynamicProxyTest.class.getClassLoader(),
                new Class[]{Hello.class},
                handler);
        proxy.sayHello("world");
    }
}
