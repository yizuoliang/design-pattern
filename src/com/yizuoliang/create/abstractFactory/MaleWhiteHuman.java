package com.yizuoliang.create.abstractFactory;

/**
 * @ClassName: MaleWhiteHuman
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:30
 */
public class MaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
