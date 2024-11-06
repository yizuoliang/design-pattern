package com.yizuoliang.create.abstractFactory;

/**
 * @ClassName: FemaleYellowHuman
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:28
 */
public class FemaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
