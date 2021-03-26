package com.by.bsm.system.controller;

import com.by.bsm.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 测试控制器
 * @author:Lijw
 * @createTime: 2021-02-03 14:53
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/testMeth")
    @ResponseBody
    public List<Map<Object,Object>> testMeth(){
        //测试一下
        List<Map<Object,Object>> list = testService.testMeth();
        return list;
    }
}



















