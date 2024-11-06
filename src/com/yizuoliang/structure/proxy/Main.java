package com.yizuoliang.structure.proxy;

/**
 * @ClassName: Main
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 16:34
 */
public class Main {

    public static void main(String[] args) {
        GamePlayerProxy proxyPlayer = new GamePlayerProxy(new GamePlayer("张三"));
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxyPlayer.login("zhangSan", "password");
        //开始杀怪
        proxyPlayer.killBoss();
        //升级
        proxyPlayer.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
