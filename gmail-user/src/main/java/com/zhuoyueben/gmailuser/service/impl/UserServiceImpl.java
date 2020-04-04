package com.zhuoyueben.gmailuser.service.impl;

import com.zhuoyueben.gmailuser.dao.UserDao;
import com.zhuoyueben.gmailuser.entity.Hr;
import com.zhuoyueben.gmailuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author TeaBen
 * @Date 2020-04-04 12:35
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<Hr> getUser() {
        return userDao.selectAllUser();
    }
    public List<Hr> getAllUser() {
        return userDao.selectAll();
    }

    @Override
    public Hr getUserById(String id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(Hr hr) {
        return userDao.insert(hr);
    }
}
