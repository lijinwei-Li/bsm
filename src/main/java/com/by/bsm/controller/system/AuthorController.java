package com.by.bsm.controller.system;

import com.by.bsm.entity.common.ResultObject;
import com.by.bsm.entity.system.User;
import com.by.bsm.service.system.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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
public class AuthorController {

    @Autowired
    AuthorService AuthorService;

    /**
     * 默认初始访问登录页面
     * @return
     */
    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }

    /**
     * 登录接口
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    @ResponseBody
    @PostMapping("/author/login")
    public ResultObject login(String userName,String password){
        log.info("userName:{}-pwd:{}",userName,password);
        //返回对象
        ResultObject result = new ResultObject();
        Map<Object, Object> map = new HashMap<>();
        //判断是否已注册，认证用户信息--
        User user = AuthorService.getUser(userName,password);
        if(user != null){
            map.put("status","1");
            result = result.getSuccess(map,"登录成功");
        }else{
            map.put("status","0");
            result = result.getSuccess(map,"用户名或密码错误");
        }
        return result;
    }

    /**
     * 注册接口
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping("/author/register")
    public ResultObject register(User user){
        log.info("===User:{}",user);
        ResultObject resultObject = new ResultObject();
        //参数校验
        if(user != null){
            String userName = user.getUserName();
            String password = user.getPassword();
            if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password)){
                //用户名不能重复
                User userN = AuthorService.getUserByUserName(userName);
                if(userN != null){
                    return resultObject = resultObject.getFail(user,"用户名已存在！");
                }
                //新建用户
                AuthorService.newUser(user);
                resultObject = resultObject.getSuccess(user, "注册成功");
            }else {
                resultObject = resultObject.getFail(user, "参数为空！");
            }
        }
        return resultObject;
    }
}




















