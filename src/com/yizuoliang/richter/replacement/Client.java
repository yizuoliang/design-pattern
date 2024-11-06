package com.yizuoliang.richter.replacement;

/**
 * @ClassName: Client
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/4 17:15
 */
public class Client {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new MachineGun());
        soldier.killEnemy();

        Snipper snipper = new Snipper();
        snipper.killEnemy(new AUG());
    }
}
