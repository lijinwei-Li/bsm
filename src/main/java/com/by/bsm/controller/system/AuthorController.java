package com.by.bsm.controller.system;

import com.by.bsm.entity.common.ResultObject;
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
    public ResultObject login(String userName,String pwd){
        log.info("userName:{}-pwd:{}",userName,pwd);
        //返回对象
        ResultObject result = new ResultObject();
        Map<Object, Object> map = new HashMap<>();
        //判断是否已注册，认证用户信息
        User user = AuthorService.getUser(userName,pwd);
        if(user != null){
            map.put("status","1");
            result = result.getSuccess(map,"登录成功");
        }else{
            map.put("status","0");
            result = result.getSuccess(map,"用户名或密码错误");
        }
        return result;
    }

}
