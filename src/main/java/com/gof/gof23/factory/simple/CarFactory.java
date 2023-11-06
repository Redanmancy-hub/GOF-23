package com.gof.gof23.factory.simple;


//静态工厂模式：增加一个新产品，如果不修改代码的前提下，做不到
//遵循开闭原则
public class CarFactory {

    // 方法一（会改动代码结构）
    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new WuLing();
        }else if (car.equals("特斯拉")){
            return new Tesla();
        }
        return null;
    }

    // 方法二(冗余)
    public static Car getWuLing(){
        return new WuLing();
    }
    public static Car getTesla(){
        return new Tesla();
    }
    public static Car getDaZhong(){
        return new DaZhong();
    }
}
