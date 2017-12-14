package com.springtest.proxy;

public class BuyBookImplProxy implements IBuyBook {

    private IBuyBook iBuyBook;


    public BuyBookImplProxy(IBuyBook iBuyBook) {
        this.iBuyBook = iBuyBook;
    }

    @Override
    public void buyBook() {
        prepareBuy();
        iBuyBook.buyBook();
        after();
    }

    private void prepareBuy() {
        System.out.println("准备买书的钱");
    }

    private void after() {
        System.out.println("拿着书回家去看");
    }
}
