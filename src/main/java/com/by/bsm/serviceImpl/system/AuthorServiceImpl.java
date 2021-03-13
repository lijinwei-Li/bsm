package com.by.bsm.serviceImpl.system;

import com.by.bsm.entity.system.User;
import com.by.bsm.mapper.system.AuthorMapper;
import com.by.bsm.service.system.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:Lijw
 * @createTime: 2021-02-26 16:55
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorMapper authorMapper;

    @Override
    public User getUser(String userName, String pwd) {
        User user = authorMapper.getUser(userName,pwd);
        return user;
    }

    @Override
    public User getUserByUserName(String userName) {
         return authorMapper.getUserByUserName(userName);
    }

    @Override
    public void newUser(User user) {
        //生成userId
        int i = (int) ((Math.random() * 9 + 1) * 100000);
        String s = String.valueOf(i);
        user.setUserId(s);
        int num = authorMapper.newUser(user);
    }
}
