package com.yizuoliang.create.abstractFactory;

/**
 * @ClassName: FemaleFactory
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:32
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
