package com.gof.gof23.abstractFactory;

// 路由器产品接口
public interface IRouterProduct {
    void start();
    void shutdown();
    void openwifi();
    void setting();
}
