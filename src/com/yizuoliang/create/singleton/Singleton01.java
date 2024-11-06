package com.yizuoliang.create.singleton;

/**
 * 单例模式
 * 饿汉式
 * 累加载的时候就创建了实例,导致内存资源浪费
 *
 */
public class Singleton01 {

    private  static Singleton01 instance = new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance(){
        return instance;
    }
}
