package com.yizuoliang.behavior.command;

/**
 * @ClassName: CodeGroup
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/7 9:20
 */
public class CodeGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求修改一项功能...");
    }

    @Override
    public void change() {
        System.out.println("客户要求删除一项功能...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");
    }
}
