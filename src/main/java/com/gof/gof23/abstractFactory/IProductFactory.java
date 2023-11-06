package com.gof.gof23.abstractFactory;

// 抽象产品工厂
public interface IProductFactory {

    // 生产手机产品
    IPhoneProduct iPhoneProduct();
    // 生产路由器产品
    IRouterProduct iRouterProduct();
}
