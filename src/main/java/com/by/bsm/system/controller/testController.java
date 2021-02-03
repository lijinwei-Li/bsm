package com.by.bsm.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试控制器
 * @author:Lijw
 * @createTime: 2021-02-03 14:53
 */
@Controller
@RequestMapping("/test")
public class testController {

    @RequestMapping("/testMeth")
    @ResponseBody
    public String testMeth(){
        return "111111111111111111111111111111";
    }
}
