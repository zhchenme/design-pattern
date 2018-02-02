package com.jas.jdk.proxy;

/**
 * @author Jas
 * @create 2018-02-01 9:56
 **/
public class Dog implements Animal {
    @Override
    public void cry() {
        System.out.println("Dog wang wang ...");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat ...");
    }
}
