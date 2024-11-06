package com.yizuoliang.single.responsibility;

/**
 * @ClassName: ConnectionManager
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 16:31
 */
public class ConnectionManager implements IConnectionManager{
    @Override
    public void dial(String phoneNum) {
        System.out.println("拨号"+ phoneNum);
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");
    }
}
