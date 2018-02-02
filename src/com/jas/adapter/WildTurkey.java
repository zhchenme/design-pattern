package com.jas.adapter;

/**
 * 实现了Turkey 接口中的两个方法
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobbble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance!");
    }
}
