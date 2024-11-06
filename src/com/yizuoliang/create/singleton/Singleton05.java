package com.yizuoliang.create.singleton;

/**
 * 单例模式
 * 枚举的方法
 * 枚举是java中的一种特殊的类,
 * 1.每一个枚举元素都是单例的,在JVM中只有一个实例
 * 2.而且实例都存在JVM的常量池中
 * 3.单实例,线程安全
 * 4.枚举类被加载时,枚举类也就开始实例化(加载的时候也是访问的时候才进行加载,也是懒加载)
 */
public enum Singleton05 {

    INSTANCE;


    public void doSomething() {
        System.out.println("Singleton using Enum!");
    }
}
