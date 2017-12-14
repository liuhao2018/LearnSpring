package com.springtest.ioc_and_di.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class LoginAction {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;


    public void login() {
        loginService.login();
    }
}
