package com.yizuoliang.create.abstractFactory;

/**
 * @ClassName: FemaleWhiteHuman
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:30
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
