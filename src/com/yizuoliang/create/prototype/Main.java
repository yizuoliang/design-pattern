package com.yizuoliang.create.prototype;

import java.util.Random;

/**
 * @ClassName: Main
 * @Description:
 * @Author: yizuoliang
 * @Date: 2024/11/6 15:49
 */
public class Main {



    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;
    public static void main(String[] args) throws CloneNotSupportedException {
        //模拟发送邮件
        int i=0;
        //把模板定义出来，这个是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");

        /**
         * 单线程的,如果有660W封邮件需要发送,一封0.22秒,则需要33小时才能发送完,显然不合适
         */
        while(i<MAX_COUNT){
            Mail cloneMail = mail.clone();
            //以下是每封邮件不同的地方
            cloneMail.setAppellation(getRandString(5)+" 先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8) +".com");
            //然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }
    //发送邮件,这里设置成异步的,不需要等待
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject() + "\t收件人： "+mail.getReceiver()+"\t...发送成功！");
    }
    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
