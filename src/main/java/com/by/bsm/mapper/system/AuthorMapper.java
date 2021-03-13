package com.by.bsm.mapper.system;

import com.by.bsm.entity.system.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author lijw
 */
public interface AuthorMapper {
    /**
     * 根据用户名密码查询用户信息
     * @param userName
     * @param pwd
     * @return
     */
    User getUser(@Param("userName") String userName, @Param("pwd") String pwd);
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);
    /**
     * 创建新用户
     * @param user
     * @return
     */
    int newUser(User user);
}
