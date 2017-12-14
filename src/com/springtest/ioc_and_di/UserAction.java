package com.springtest.ioc_and_di;

public class UserAction {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save() {
        userService.save();
    }
}
