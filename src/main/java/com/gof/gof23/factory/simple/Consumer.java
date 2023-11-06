package com.gof.gof23.factory.simple;

public class Consumer {
    public static void main(String[] args) {
/*      传统方式new
        Car car = new WuLing();
        Car car1 = new Tesla();*/

        // 通过工厂方式去创建
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();
    }
}
