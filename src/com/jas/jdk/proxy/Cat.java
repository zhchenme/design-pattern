package com.jas.jdk.proxy;

/**
 * @author Jas
 * @create 2018-02-01 10:39
 **/
public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("Cat miao miao ...");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat ...");
    }
}
