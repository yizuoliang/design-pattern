package com.yizuoliang.single.responsibility;

/**
 * @ClassName: IConnectionManager
 * @Description: 电话连接管理接口
 * @Author: yizuoliang
 * @Date: 2024/11/4 16:27
 */
public interface IConnectionManager {

    void dial(String phoneNum);

    void hangup();
}
