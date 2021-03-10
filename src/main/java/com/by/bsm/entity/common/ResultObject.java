package com.by.bsm.entity.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 所有通过springMVC返回给前端都必须封装此对象返回
 * @Author Lijw
 * @Date 2021/3/10 20:59
 * @Desc
 **/
@Data
public class ResultObject implements Serializable {

    private static final long serialVersionUID = 3761952031219615266L;
    /**
     * 状态码
     * 请求成功：200
     * 请求失败：500
     */
    private String status;
    /**
     * 状态信息
     */
    private String msg;
    /**
     * 返回结果
     */
    private Object data;

    /**
     * 无参构造
     */
    public ResultObject(){}

    private ResultObject(Object data){
        this.data = data;
    }

    /**
     * 请求成功
     * @param data 返回数据
     * @return
     */
    public ResultObject getSuccess(Object data){
        ResultObject result = new ResultObject(data);
        //状态为200
        result.setStatus(Constant.SUCCESS_STATUS);
        //状态信息
        result.setMsg(Constant.SUCCESS_STATUS_MSG);
        //返回数据
        result.setData(data);
        return result;
    }

    /**
     * 请求成功
     * @param data 返回数据
     * @param msg 状态信息
     * @return
     */
    public ResultObject getSuccess(Object data,String msg){
        ResultObject result = new ResultObject(data);
        //状态为200
        result.setStatus(Constant.SUCCESS_STATUS);
        //状态信息
        result.setMsg(msg);
        //返回数据
        result.setData(data);
        return result;
    }

    /**
     * 请求失败
     * @param data 返回数据
     * @return
     */
    public ResultObject getFail(Object data){
        ResultObject result = new ResultObject(data);
        //状态为200
        result.setStatus(Constant.FAIL_STATUS);
        //状态信息
        result.setMsg(Constant.FAIL_STATUS_MSG);
        //返回数据
        result.setData(data);
        return result;
    }

    /**
     * 请求失败
     * @param data 返回数据
     * @param msg 失败的信息
     * @return
     */
    public ResultObject getFail(Object data,String msg){
        ResultObject result = new ResultObject(data);
        //状态为200
        result.setStatus(Constant.FAIL_STATUS);
        //状态信息
        result.setMsg(msg);
        //返回数据
        result.setData(data);
        return result;
    }
}





















