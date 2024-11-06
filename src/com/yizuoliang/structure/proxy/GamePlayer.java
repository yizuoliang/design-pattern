package com.yizuoliang.structure.proxy;

/**
 * @ClassName: GamePlayer
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 16:33
 */
public class GamePlayer implements IGamePlayer{
    private String name = "";
    //通过构造函数传递名称
    public GamePlayer(String name){
        this.name = name;
    }
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user+"的用户"+this.name+"登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}
