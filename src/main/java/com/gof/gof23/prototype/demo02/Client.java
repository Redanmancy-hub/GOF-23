package com.gof.gof23.prototype.demo02;

import java.util.Date;

/**
 * 客服端
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象Video1
        Date date = new Date();
        Video video1 = new Video("视频名字", date);
        //克隆对象video2
        Video video2 = (Video) video1.clone();
        System.out.println("video1 = >" + video1);
        System.out.println("video2 = >" + video2);
        System.out.println("=============================");
        date.setTime(55413459);
        System.out.println("video1 = " + video1);
        System.out.println("video2 = " + video2);
    }
}
