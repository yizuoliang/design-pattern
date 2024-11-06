package com.yizuoliang.create.factory;

/**
 * @ClassName: Human
 * @Description: 抽象类(人)定义
 * @Author: yizuoliang
 * @Date: 2024/11/6 11:55
 */
public interface Human {
    //每个人种的皮肤都有相应的颜色
    public void getColor();
    //人类会说话
    public void talk();
}
