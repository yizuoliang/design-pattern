package com.yizuoliang.create.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * 具体的抽象类(人)工厂
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human=null;
        try {
            //产生一个人种
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }

    /**
     * 当然也可以设置成单例工厂
     */
    private static Human singleton;
    static{
        try {
            Class cl= Class.forName(Human.class.getName());
            //获得无参构造
            Constructor constructor=cl.getDeclaredConstructor();
                //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Human)constructor.newInstance();
        } catch (Exception e) {
            //异常处理
        }
    }
    public static Human getSingleton(){
        return singleton;
    }


    /**
     * 延时工厂,当一个对象被消费完后不会马上被释放,我们可以放到map中,等下次使用时,先去缓存中找,在判断是否需要实例化
     *
     * 延时工厂可以现在对象实例化的数量,比如说JDBC的最大连接数,就是内存中最大实例化数量
     * 也可以降低对象的产生和销毁频率,提高性能
     */
    private static final Map<String,Human> prMap = new HashMap();
    public static synchronized  <T extends Human> T createHuman(String type) throws Exception{
        Human human=null;
        //如果Map中已经有这个对象
        if(prMap.containsKey(type)){
            human = prMap.get(type);
        }else{
            if(type.equals("black")){
                human = new BlackHuman();
            }else if(type.equals("white")){
                human = new WhiteHuman();
            }else if(type.equals("yello")){
                human = new YellowHuman();
            }
            //同时把对象放到缓存容器中
            prMap.put(type,human);
        }
        return (T) human;
    }
}
