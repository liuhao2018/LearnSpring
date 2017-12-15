package com.springtest.jdbc;

public interface IUserDao {
    void add(User user);
    void remove(Long id);
    void get(Long id);
    void update(User user);
}
