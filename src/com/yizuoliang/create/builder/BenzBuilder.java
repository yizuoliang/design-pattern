package com.yizuoliang.create.builder;

import java.util.ArrayList;

/**
 * @ClassName: BenzBuilder
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:58
 */
public class BenzBuilder extends CarBuilder{

    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
