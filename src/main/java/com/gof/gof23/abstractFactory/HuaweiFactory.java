package com.gof.gof23.abstractFactory;

public class HuaweiFactory implements IProductFactory{
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaweiRouter();
    }
}
