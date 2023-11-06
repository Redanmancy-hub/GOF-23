package com.gof.gof23.singleton;

import java.lang.reflect.Constructor;

public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }

}
class Test{
    public static void main(String[] args) throws Exception {
        // 返回的两个对象是相等的
        EnumSingle instance1 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle instance2 = declaredConstructor.newInstance();

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);

    }
}
