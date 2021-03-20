package com.by.bsm;

import com.alibaba.fastjson.JSON;
import com.by.bsm.entity.system.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

/**
 * 测试Jedis
 * @Author Lijw
 * @Date 2021/3/17 20:44
 * @Desc
 **/
@Slf4j
@SpringBootTest
public class TestRedis {

    private String redisIp = "192.168.235.132";

    private int redisPort = 6379;

    Jedis jedis;

    @Before
    public void init(){
        jedis = new Jedis(redisIp, redisPort);
    }

    /**
     * String类型操作方式
     */
    @Test
    public void testString(){
        jedis.set("name1","sanbp");
        jedis.set("age1","18");
        System.out.println(jedis.get("name")+"-"+jedis.get("age"));
    }

    /**
     * 设定key过期方法
     * @throws InterruptedException
     */
    @Test
    public void testTimeOut() throws InterruptedException {
        //设定key过期方法
        jedis.setex("myname",2,"jinweili");
        Thread.sleep(3000);
        //当不存在是操作正常，key存在是，操作失败，常用于分布式锁。
        jedis.setnx("myname","sanbo");
        System.out.println("myname = " + jedis.get("myname"));
    }

    /**
     * 利用redis保存业务数据
     */
    @Test
    public void testsetObject(){
        User user = new User();
        user.setUserId("0001");
        user.setUserName("黎锦威");
        user.setAge("16");
        user.setPhoneNum("13556099173");
        String s = JSON.toJSONString(user);
        jedis.set("myUser",s);
        System.out.println("myUser = " + jedis.get("myUser"));
    }

}




















