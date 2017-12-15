package com.springtest.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl extends JdbcDaoSupport implements IUserDao {

    @Override
    public void add(User user) {
        String sql = "INSERT INTO user (name) VALUES (?)";
        Object[] args = new Object[]{user.getName()};
        getJdbcTemplate().update(sql,args);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void get(Long id) {

    }

    @Override
    public void update(User user) {

    }
}
