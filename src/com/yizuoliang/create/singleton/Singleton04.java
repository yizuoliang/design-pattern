package com.yizuoliang.create.singleton;

/**
 * 单例模式
 * 静态内部类
 * 静态内部类,也是懒加载,如果JVM加载了Singleton0,这时候不会去加载内部类SingletonHolder,内部类要等调用了getInstance方法的时候再进行加载
 */
public class Singleton04 {

    private Singleton04(){}
    private static class SingletonHolder {
        private static final Singleton04 INSTANCE = new Singleton04();
    }
    public static Singleton04 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
