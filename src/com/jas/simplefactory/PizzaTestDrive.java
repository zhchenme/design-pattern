package com.jas.simplefactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("greek");
        
    }
    /**
     * 输出
     * 
     * 准备 ...希腊披萨
     * 添加配料 ...大蒜番茄酱
     * 烘烤25分钟。
     * 把比萨饼切成对角片。
     * 将披萨放到披萨商店的盒子中。
     * 
     */
}
