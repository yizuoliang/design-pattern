package com.yizuoliang.create.builder;

import java.util.ArrayList;

/**
 * @ClassName: BMWBuilder
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:59
 */
public class BMWBuilder extends CarBuilder{
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
