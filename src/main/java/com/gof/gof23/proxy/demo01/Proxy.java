package com.gof.gof23.proxy.demo01;

//中介
public class Proxy implements Rent{
    private Host host;

    public Proxy(){

    }
    public Proxy(Host host) {
        this.host = host;
    }


    @Override
    public void rent() {
        //当房东出租房屋
        host.rent();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fee(){
        System.out.println("中介收中介费");
    }

    public void hetong(){
        System.out.println("中介签租赁合同");
    }
}
