package com.gof.gof23.builder.demo1;

public class Test {
    public static void main(String[] args) {
        // 指挥者
        Director director = new Director();
        // 指挥 具体的工人完成 产品
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
