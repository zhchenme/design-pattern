package com.jas.templatemethod;

public class Coffee extends CaffineBeverage {
    @Override
    void brew() {
        System.out.println("用沸水浸泡咖啡！");
    }

    @Override
    void addCondiments() {
        System.out.println("加入糖与牛奶！");
    }
}
