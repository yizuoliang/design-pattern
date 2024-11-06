package com.yizuoliang.richter.replacement;

/**
 * @ClassName: AbstractToy
 * @Description: 这个类的意思就是,玩具枪将不能被客户端用来调用杀敌人了, 如果枪有其他形状之类的属性可以被继承
 * @Author: yizuoliang
 * @Date: 2024/11/4 17:18
 */
public abstract class AbstractToy{

    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    void color(){
        gun.color();
    }
}
