package com.gof.gof23.singleton;

//静态内部类
public class Holder {

    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }
    public static class InnerClass{
        public final static Holder HOLDER = new Holder();
    }

}
