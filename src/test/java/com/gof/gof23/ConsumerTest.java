package com.gof.gof23;

import com.gof.gof23.abstractFactory.HuaweiFactory;
import com.gof.gof23.abstractFactory.IPhoneProduct;
import com.gof.gof23.abstractFactory.IRouterProduct;
import com.gof.gof23.abstractFactory.XiaomiFactory;
import com.gof.gof23.builder.Director;
import com.gof.gof23.builder.Product;
import com.gof.gof23.builder.Worker;
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

    /**
     * 抽象工厂客服端
     */
    @Test
    public void test3(){
        System.out.println("---------小米工厂---------");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IPhoneProduct iPhoneProduct = xiaomiFactory.iPhoneProduct();
        iPhoneProduct.start();
        iPhoneProduct.shutdown();
        iPhoneProduct.sendSMS();
        iPhoneProduct.callup();

        IRouterProduct iRouterProduct = xiaomiFactory.iRouterProduct();
        iRouterProduct.start();
        iRouterProduct.shutdown();
        iRouterProduct.setting();
        iRouterProduct.openwifi();

        System.out.println("---------华为工厂---------");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IPhoneProduct iPhoneProduct1 = huaweiFactory.iPhoneProduct();
        iPhoneProduct1.start();
        iPhoneProduct1.shutdown();
        iPhoneProduct1.sendSMS();
        iPhoneProduct1.callup();

        IRouterProduct iRouterProduct2 = huaweiFactory.iRouterProduct();
        iRouterProduct2.start();
        iRouterProduct2.shutdown();
        iRouterProduct2.setting();
        iRouterProduct2.openwifi();
    }

    /**
     * 建造者模式
     */
    @Test
    public void test4(){
        // 指挥者
        Director director = new Director();
        // 指挥 具体的工人完成 产品
        Product build = director.build(new Worker());
        System.out.println(build.toString());

    }
}
