package com.yizuoliang.create.singleton;

/**
 * 单例模式
 * 懒汉式
 * 线程安全,双重检查锁定
 * 只有第一次创建的时候加锁,双重检查,提升的性能
 */
public class Singleton03 {

    private  static Singleton03 instance = null;

    private Singleton03(){}

    public static  Singleton03 getInstance(){
        if(instance==null){
            synchronized (Singleton03.class){
                if(instance==null){
                    instance = new Singleton03();
                }
                return instance;
            }
        }else {
            return instance;
        }
    }
}
