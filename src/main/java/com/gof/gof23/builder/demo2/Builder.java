package com.gof.gof23.builder.demo2;

public abstract class Builder {
    abstract Builder buildA(String msg);//汉堡
    abstract Builder buildB(String msg);//可乐
    abstract Builder buildC(String msg);//薯条
    abstract Builder buildD(String msg);//甜品

    // 通过四个抽象的步骤，去完成抽象的构建
    //不给产品赋值，就是设置的默认值
    abstract Product getProduct();
}
