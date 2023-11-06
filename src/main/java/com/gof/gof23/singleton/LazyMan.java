package com.gof.gof23.singleton;

import java.lang.reflect.Constructor;

// 懒汉式单例
public class LazyMan {
    private static boolean flag = false;


    private LazyMan() {
        synchronized (LazyMan.class){
            if (flag == false){
                flag = true;
            }else {
                throw new RuntimeException("不要试图使用反射去破坏异常");
            }
        }
    }

    //指令重排
    private volatile static LazyMan lazyMan;

    // 双重检测锁模式（DCL）+ 原子性操作
    public static LazyMan getInstance() {
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();        //不是一个原子性操作
                }
            }
        }
        return lazyMan;
    }

    /**
     * 1.分配内存空间
     * 2.执行构造方法，初始化对象
     * 3.把这个对象指向这个空间
     */
    //反射==>可以破坏单例
    public static void main(String[] args) throws Exception {
        LazyMan instance1 = LazyMan.getInstance();
        //利用构造器
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        //无视私有的构造器
        declaredConstructor.setAccessible(true);
        //通过反射来创建对象
        LazyMan instance2 = declaredConstructor.newInstance();

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}
