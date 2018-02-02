package com.jas.singleton;

public class Singleton {
    //volatile 关键字用来保证内存可见性，使多线程正确处理uniqueInstance 对象
    private static volatile Singleton uniqueInstance;

    private Singleton(){}

    public synchronized static Singleton getInstance(){
        //使用这种方式，只有第一次才会彻底访问并执行这里的代码
        if(uniqueInstance == null){     //检查实例，如果不存在进入同步区
            synchronized (Singleton.class){
                if(uniqueInstance == null){     //进入同步区后，再检查一次。如果为null，才开始创建实例
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
