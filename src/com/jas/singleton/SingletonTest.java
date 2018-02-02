package com.jas.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println(singleton1 == singleton2);
    }
    /**
     * 输出
     * true
     */
}
