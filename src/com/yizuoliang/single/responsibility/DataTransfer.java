package com.yizuoliang.single.responsibility;

/**
 * @ClassName: DataTransfer
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 16:33
 */
public class DataTransfer implements IDataTransfer {
    @Override
    public void dataTransfer(IConnectionManager cm) {
        System.out.println("通话中......");
    }
}
