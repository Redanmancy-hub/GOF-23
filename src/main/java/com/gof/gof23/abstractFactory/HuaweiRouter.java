package com.gof.gof23.abstractFactory;

public class HuaweiRouter implements IRouterProduct{

    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openwifi() {
        System.out.println("华为路由器连接wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置属性");
    }
}
