package com.liuping.user.dao;

import com.liuping.user.model.User;

import java.util.List;

/**
 * Created by liuping on 15/12/8.
 */
public interface UserDao {

    public int save(User user);

    public List<User> findAll();
}
