package com.by.bsm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于登录注册相关的控制器
 * @author:Lijw
 * @createTime: 2021-02-10 19:31
 */
@Controller
@Slf4j
public class LoginController {
    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login/loginByNameAndPwd")
    @ResponseBody
    public Object loginByNameAndPwd(String userName,String pwd){
        log.info("userName:{}-pwd:{}",userName,pwd);
        Map<Object, Object> map = new HashMap<>();
        map.put("code","200");
        map.put("url","index.html");
        return map;
    }
}
