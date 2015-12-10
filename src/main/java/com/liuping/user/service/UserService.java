package com.liuping.user.service;

import com.liuping.user.model.User;

import java.util.List;

/**
 * Created by liuping on 15/12/8.
 */
public interface UserService {

    public int save(User user);

    public List<User> findAll();

    public List<String> findName();
}
