package com.sj.design.singleton.case02;

/**
 * 饿汉式（静态代码块）
 *
 */
public class Singleton {
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
    public  void hello(){
        System.out.println("饿汉式 单例模式.");
    }
}
