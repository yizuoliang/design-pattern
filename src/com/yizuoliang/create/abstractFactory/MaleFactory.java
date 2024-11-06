package com.yizuoliang.create.abstractFactory;

/**
 * @ClassName: MaleFactory
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:34
 */
public class MaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
