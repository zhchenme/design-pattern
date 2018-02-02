package com.jas.templatemethod;

public abstract class CaffineBeverage {
    /**
     * 模板方法，用作一个算法的模板，用于制作茶与咖啡
     * 并定义为final 的，防止子类覆盖
     */
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    void boilWater(){
        System.out.println("煮沸水！");
    }
    
    abstract void brew();
    
    void pourInCup(){
        System.out.println("倒进杯子里！");
    }
    
    abstract void addCondiments();
}
