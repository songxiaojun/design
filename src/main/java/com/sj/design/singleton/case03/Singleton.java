package com.sj.design.singleton.case03;

/**
 * 懒汉式(线程不安全)[不可用]
 *
 */
public class Singleton {
    /**
     * 声明一个 static 类型的计数器
     */
    private static int count;
    private static Singleton singleton;

    /**
     * 构造器私有化,不能在类的外部随意创建对象
     */

    private Singleton(){
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }
    /**
     * 请注意,这样的代码再多线程环境下是有问题的
     * 很可能 instance = new Singleton(); 会被执行多次
     * @return
     */
    public static Singleton getInstance(){
        if(singleton ==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
