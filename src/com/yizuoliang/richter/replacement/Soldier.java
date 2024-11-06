package com.yizuoliang.richter.replacement;

/**
 * @ClassName: Soldier
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 17:11
 */
public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy(){
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }
}
