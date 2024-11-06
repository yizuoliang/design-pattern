package com.yizuoliang.create.abstractFactory;

/**
 * @ClassName: MaleBlackHuman
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 14:28
 */
public class MaleBlackHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
