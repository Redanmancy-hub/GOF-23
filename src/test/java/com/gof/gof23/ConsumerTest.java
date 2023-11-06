package com.gof.gof23;

import com.gof.gof23.abstractFactory.HuaweiFactory;
import com.gof.gof23.abstractFactory.IPhoneProduct;
import com.gof.gof23.abstractFactory.IRouterProduct;
import com.gof.gof23.abstractFactory.XiaomiFactory;
import com.gof.gof23.builder.demo1.Director;
import com.gof.gof23.builder.demo1.Product;
import com.gof.gof23.builder.demo1.Worker;

import com.gof.gof23.factory.method.Car;
import com.gof.gof23.factory.method.TeslaFactory;
import com.gof.gof23.factory.method.WuLingFactory;

import org.junit.jupiter.api.Test;

public class ConsumerTest extends Gof23ApplicationTests{
    /**
     * 静态工厂模式
     */
/*    @Test
    public void test1() {
        *//*      传统方式new
        Car car = new WuLing();
        Car car1 = new Tesla();*//*

        // 通过工厂方式去创建
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();
    }*/

    /**
     * 工厂方法模式
     */
    @Test
    public void test2(){
        Car car = new WuLingFactory().getCar();
        car.name();

        Car car1 = new TeslaFactory().getCar();
        car1.name();
    }
}
