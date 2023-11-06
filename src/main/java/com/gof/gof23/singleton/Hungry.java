package com.gof.gof23.singleton;

// 饿汉式单例
public class Hungry {

    // 消耗内存
    private static byte[] data1 = new byte[1024*1024];
    private static byte[] data2 = new byte[1024*1024];
    private static byte[] data3 = new byte[1024*1024];
    private static byte[] data4 = new byte[1024*1024];

    //构造器私有
    private Hungry(){

    }
    private final static Hungry HUNGRY = new Hungry();
    public static Hungry getInstance(){
        return HUNGRY;
    }
}
