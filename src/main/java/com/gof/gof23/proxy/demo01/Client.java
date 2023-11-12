package com.gof.gof23.proxy.demo01;

//租客
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
        proxy.seeHouse();
        proxy.hetong();
        proxy.fee();
    }
}
