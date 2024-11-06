package com.yizuoliang.richter.replacement;

/**
 * @ClassName: MachineGun
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 17:14
 */
public class MachineGun extends AbstractGun{
    @Override
    void shoot() {
        System.out.println("机枪扫射...");
    }

    @Override
    void color() {
        System.out.println("黑色");
    }
}
