package com.yizuoliang.create.abstractFactory;

/**
 * @ClassName: MaleYellowHuman
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:28
 */
public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
