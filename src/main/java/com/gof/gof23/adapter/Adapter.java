package com.gof.gof23.adapter;

//1.继承（类适配器，单继承）
//真正的适配器,需要连接usb，连接网线
public class Adapter extends Adaptee implements NetToUSB{
    @Override
    public void handleRequest() {
        super.request();
    }
}
