package com.springtest.ioc_and_di.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    @Qualifier("loginDao")
    private LoginDao loginDao;

    public void login() {
        loginDao.login();
    }
}
