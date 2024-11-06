package com.yizuoliang.create.factory;

/**
 * 创建工厂的抽象类
 * 工厂方法模式的弱化,也可以把这个抽象类去掉
 *  实际项目中用到的比较多,工厂类的扩展比较困难
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
