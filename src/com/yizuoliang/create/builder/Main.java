package com.yizuoliang.create.builder;

import java.util.ArrayList;

/**
 * @ClassName: Main
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:56
 */
public class Main {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        //我们把这个顺序赋予奔驰车
        benz.setSequence(sequence);
        benz.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel carModel = bmwBuilder.getCarModel();
        carModel.run();
    }
}
