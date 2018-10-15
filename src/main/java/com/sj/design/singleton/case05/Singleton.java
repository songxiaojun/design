package com.sj.design.singleton.case05;

/**
 * 双重检查[推荐用]
 */
public class Singleton {
    private int count;
    private static Singleton singleton;
    private Singleton(){
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }
    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
