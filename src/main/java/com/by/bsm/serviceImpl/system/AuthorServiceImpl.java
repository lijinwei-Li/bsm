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
        return null;
    }
}
