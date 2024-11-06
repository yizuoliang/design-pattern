package com.yizuoliang.behavior.mediator;

/**
 * @ClassName: AbstractColleague
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 17:11
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
