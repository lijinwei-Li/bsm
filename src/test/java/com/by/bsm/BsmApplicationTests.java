package com.by.bsm;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class BsmApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test01() {
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time="2018-09-29 16:39:56";
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //日期转时间戳（毫秒）
        long a = date.getTime();
        System.out.print("Format To times:"+a);
    }
    @Test
    public void test02() {
        String time="1615563690000";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long lt = new Long(time);
        Date date = new Date(lt);
        String  res = simpleDateFormat.format(date);
        System.out.print("Format To times:"+res );
    }
    @Test
    public void test03() {
        //String time="2021-03-12 07:55:15.848";
        String time="1615565191853";
        if(StringUtils.isNotBlank(time)){
            int index = time.indexOf(".");
            if(index > -1){
                time = time.substring(0, index);
                System.out.println("time = " + time + "====index = " + index);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                try{
                    Date date = sdf.parse(time);
                    long newTime = date.getTime();
                    String s = String.valueOf(newTime);
                    System.out.println("s = " + s);
                }catch (Exception e){

                }

            }else {
                System.out.println("=====time===" + time);
            }
        }
    }

}
