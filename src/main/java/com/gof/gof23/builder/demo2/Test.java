package com.gof.gof23.builder.demo2;

import com.gof.gof23.builder.demo2.Worker;

public class Test {
    public static void main(String[] args) {
        // 服务员-指挥者
        Worker worker = new Worker();
        // 链式编程
        Product product = worker.buildA("全家桶").getProduct();
        System.out.println(product.toString());
    }
}
