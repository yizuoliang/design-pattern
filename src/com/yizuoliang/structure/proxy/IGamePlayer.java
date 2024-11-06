package com.yizuoliang.structure.proxy;

/**
 * @ClassName: IGamePlayer
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 16:33
 */
public interface IGamePlayer {

    //登录游戏
    public void login(String user,String password);
    //杀怪，网络游戏的主要特色
    public void killBoss();
    //升级
    public void upgrade();
}
