package com.yizuoliang.behavior.mediator;

/**
 * @ClassName: AbstractMediator
 * @Description: 抽象中介者
 * @Author: yizuoliang
 * @Date: 2024/11/6 17:09
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;
    //构造函数
    public AbstractMediator(){
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    //中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str,Object...objects);
}
