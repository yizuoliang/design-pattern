package com.yizuoliang.richter.replacement;

/**
 * @ClassName: Handgun
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 17:13
 */
public class Handgun extends AbstractGun{
    @Override
    void shoot() {
        System.out.println("手枪射击...");
    }

    @Override
    void color() {
        System.out.println("白色");
    }
}
