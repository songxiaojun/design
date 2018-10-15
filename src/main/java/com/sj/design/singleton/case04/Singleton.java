package com.sj.design.singleton.case04;

/**
 * 懒汉式(线程安全，同步方法)[不推荐用]
 *
 */
public class Singleton {
    private int count;
    private static Singleton singleton;
    private Singleton (){
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    public static synchronized Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();

        }
        return singleton;
    }
}
