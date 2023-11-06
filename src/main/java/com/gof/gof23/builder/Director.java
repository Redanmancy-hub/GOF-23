package com.gof.gof23.builder;

// 指挥者：核心，负责指挥构建一个工程，工程如何构建，由他来决定
public class Director {
    // 指挥工人，按照指挥者给定的顺序去构建工程
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();

    }
}
