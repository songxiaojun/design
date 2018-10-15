package com.sj.design.singleton.case01;

/**
 * 饿汉式(静态常量)
 *
 * 优点：这种写法比较简单，就是在类装载的时候完成实例化，避免了线程同步问题
 * 缺点：在类装载的时候就完成了实例化，没有达到Lazy Loading的效果，如果始终从未使用过这个实例，则会造成内存的浪费
 */
public class Singleton {
    private final static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public static void hello(){
        System.out.println("饿汉式 单例模式.");
    }
}
