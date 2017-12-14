package com.springtest.ioc_and_di.ann;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
    public void login() {
        System.out.println("login.......");
    }
}
