package com.jas.templatemethod;

public class Tea extends CaffineBeverage {
    @Override
    void brew() {
        System.out.println("用沸水浸泡茶叶！");
    }

    @Override
    void addCondiments() {
        System.out.println("加入柠檬！");
    }
}
