package com.yizuoliang.single.responsibility;

/**
 * @ClassName: IPhone
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 16:38
 */
public class IPhone implements IDataTransfer, IConnectionManager{
    @Override
    public void dial(String phoneNum) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void dataTransfer(IConnectionManager cm) {

    }
}
