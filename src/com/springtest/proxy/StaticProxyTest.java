package com.springtest.proxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        IBuyBook buyBook = new BuyBookImplProxy(new BuyBookImpl());
        buyBook.buyBook();
    }
}
