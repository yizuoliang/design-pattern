package com.yizuoliang.behavior.template;

/**
 * @ClassName: HummerModel
 * @Description: 其实模版方法很简单,就是把共同的方法抽象出来,这个抽象类就是抽样模版....
 * @Author: yizuoliang
 * @Date: 2024/11/6 16:11
 */
public abstract class HummerModel {

    public abstract void start();
    //能发动，还要能停下来，那才是真本事
    public abstract void stop();
    //喇叭会出声音，是滴滴叫，还是哔哔叫
    public abstract void alarm();
    //引擎会轰隆隆地响，不响那是假的
    public abstract void engineBoom();
    //那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
    public void run(){
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.alarm();
        //到达目的地就停车
        this.stop();
    }

}
