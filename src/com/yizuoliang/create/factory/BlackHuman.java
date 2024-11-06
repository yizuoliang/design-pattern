package com.yizuoliang.create.factory;

/**
 * 抽象类(人) 具体实现
 */
public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
