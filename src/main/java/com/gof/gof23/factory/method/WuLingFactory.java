package com.gof.gof23.factory.method;

public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
