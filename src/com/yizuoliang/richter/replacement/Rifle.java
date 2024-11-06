package com.yizuoliang.richter.replacement;

/**
 * @ClassName: Rifle
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 17:14
 */
public class Rifle extends AbstractGun{
    @Override
    void shoot() {
        System.out.println("步枪射击...");
    }

    @Override
    void color() {
        System.out.println("黄色");
    }
}
