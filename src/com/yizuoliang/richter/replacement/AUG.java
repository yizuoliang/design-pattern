package com.yizuoliang.richter.replacement;

/**
 * @ClassName: AUG
 * @Description: 狙击枪,
 * @Author: yizuoliang
 * @Date: 2024/11/4 17:22
 */
public class AUG extends Rifle{

    public void zoomOut(){
        System.out.println("通过望远镜瞄准敌人");

    }

    @Override
    void shoot() {
        System.out.println("AUG射击");
    }
}
