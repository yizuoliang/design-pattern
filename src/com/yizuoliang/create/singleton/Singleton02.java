package com.yizuoliang.create.singleton;

/**
 * 单例模式
 * 懒汉式
 * 只有使用的时候加载,线程安全
 * 存在的问题是,每次获取实例的时候,都加锁了,并发的时候,可能存在线程堵塞,导致cpu上下文切换,影响性能
 */
public class Singleton02 {

    private  static Singleton02 instance = null;

    private Singleton02(){}

    public static synchronized Singleton02 getInstance(){
        if(instance==null){
            return new Singleton02();
        }else {
            return instance;
        }
    }
}
