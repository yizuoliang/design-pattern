package com.yizuoliang.behavior.command;

/**
 * @ClassName: AddRequirementCommand
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/7 15:04
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        super.rg.add();
        //给出计划
        super.rg.plan();

    }
}
