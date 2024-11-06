package com.yizuoliang.behavior.mediator;

/**
 * @ClassName: Purchase
 * @Description: 采购
 * @Author: yizuoliang
 * @Date: 2024/11/6 17:07
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    //不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
