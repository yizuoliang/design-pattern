package com.yizuoliang.behavior.command;

/**
 * @ClassName: DeletePageCommand
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/7 15:05
 */
public class DeletePageCommand extends Command{
    @Override
    public void execute() {
        //找到页面组
        super.pg.find();
        //删除一个页面
        super.pg.delete();
        //给出计划
        super.pg.plan();
    }
}
