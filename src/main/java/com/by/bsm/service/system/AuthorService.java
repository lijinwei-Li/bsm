package com.by.bsm.service.system;

import com.by.bsm.entity.system.User;

/**
 * @author:Lijw
 * @createTime: 2021-02-26 16:48
 */
public interface AuthorService {
    /**
     * 获取用户信息
     * @param userName
     * @param pwd
     * @return
     */
    User getUser(String userName, String pwd);
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);

    /**
     * 创建新用户
     * @param user
     */
    void newUser(User user);
}
