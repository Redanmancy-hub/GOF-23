package com.gof.gof23.abstractFactory;

public class Test {
    public static void main(String[] args) {
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
}
