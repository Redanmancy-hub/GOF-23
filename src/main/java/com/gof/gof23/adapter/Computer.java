package com.gof.gof23.adapter;

//客服端类：想上网，要插网线才能上网
public class Computer {
    //电脑需要连接转换器才能上网
    public void net(NetToUSB netToUSB){
        // 上网的具体实现，找一个转接头
        netToUSB.handleRequest();
    }

    //1.继承（类适配器，单继承）
/*    public static void main(String[] args) {
        //电脑，适配器，网线
        Computer computer = new Computer();//电脑
        Adaptee adaptee = new Adaptee();//网线
        Adapter adapter = new Adapter();//适配器


        computer.net(adapter);
    }*/

    //2.组合（对象适配器，常用）
    public static void main(String[] args) {
        //电脑，适配器，网线
        Computer computer = new Computer();//电脑
        Adaptee adaptee = new Adaptee();//网线
        Adapter2 adapter = new Adapter2(adaptee);//适配器

        computer.net(adapter);
    }
}
