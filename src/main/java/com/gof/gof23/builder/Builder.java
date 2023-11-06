package com.gof.gof23.builder;

// 抽象的建造者：只定义一些方法和接口
public abstract class Builder {
    abstract void buildA();//地基
    abstract void buildB();//钢筋工程
    abstract void buildC();//铺电线
    abstract void buildD();//粉刷

    // 通过四个抽象的步骤，去完成抽象的构建-完工
    abstract Product getProduct();
}
