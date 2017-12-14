package com.springtest.proxy;

public class BuyBookImpl implements IBuyBook {
    @Override
    public void buyBook() {
        System.out.println("买书");
    }
}
