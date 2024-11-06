package com.yizuoliang.create.prototype;

/**
 * @ClassName: AdvTemplate
 * @Description: 广告模版
 * @Author: yizuoliang
 * @Date: 2024/11/6 15:46
 */
public class AdvTemplate {

    //广告信名称
    private String advSubject ="XX银行国庆信用卡抽奖活动";
    //广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！...";
    //取得广告信的名称
    public String getAdvSubject(){
        return this.advSubject;
    }
    //取得广告信的内容
    public String getAdvContext(){
        return this.advContext;
    }
}
