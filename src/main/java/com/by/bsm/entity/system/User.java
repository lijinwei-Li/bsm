package com.by.bsm.entity.system;

import lombok.Data;

/**
 * 用户信息实体类
 * @author:Lijw
 * @createTime: 2021-02-26 17:07
 */
@Data
public class User {
    /**
     *用户id
     */
    private String userId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别
      */
    private String gender;
    /**
     * 年龄
     */
    private String age;
    /**
     * 出生日期
     */
    private String birthDate;
    /**
     * 手机号
     */
    private String phoneNum;
    /**
     *籍贯
     */
    private String nativePlace;
    /**
     *民族
     */
    private String nation;
    /**
     * 政治面貌
     */
    private String politicalOutlook;
    /**
     *学历
     */
    private String education;
    /**
     * 毕业院校
     */
    private String school;
    /**
     * 专业
     */
    private String major;

}
