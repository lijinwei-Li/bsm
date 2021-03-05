package com.by.bsm.controller.system;

import com.by.bsm.entity.system.User;
import com.by.bsm.service.system.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 权限控制器
 * @author:Lijw
 * @createTime: 2021-02-26 16:41
 */
@Slf4j
@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService AuthorService;

    @PostMapping("/login")
    @ResponseBody
    public Object login(String userName,String pwd){
        log.info("userName:{}-pwd:{}",userName,pwd);
        Map<Object, Object> map = new HashMap<>();

        //判断是否已注册，认证用户信息
        User user = AuthorService.getUser(userName,pwd);
        log.info("user:{}",user != null ? user.toString() : null);
        if(user != null){
            map.put("code","200");
            map.put("msg","登录成功");
            map.put("url","./index.html");

        }else{
            map.put("code","201");
            map.put("msg","用户名或密码错误");
        }
        return map;
    }

}
