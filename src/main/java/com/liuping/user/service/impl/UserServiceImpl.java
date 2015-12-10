package com.liuping.user.service.impl;

import com.liuping.user.dao.UserDao;
import com.liuping.user.model.User;
import com.liuping.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuping on 15/12/8.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    public int save(User user) {
        return this.userDao.save(user);
    }

    public List<User> findAll() {
        return this.userDao.findAll();
    }


    public List<String> findName() {
        List<String> list = new ArrayList<String>();
        list.add("lili");
        list.add("lucy");
        return list;
    }
}
