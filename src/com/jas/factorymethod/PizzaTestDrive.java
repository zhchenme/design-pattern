package com.jas.factorymethod;


public class PizzaTestDrive {
    public static void main(String[] args) {
        
        PizzaStore pizzaStore = new BJPizzaStore();
        pizzaStore.orderPizza("greek");
        
    }
    /**
     * 输出
     * 
     * 准备 ...北京人喜欢吃的希腊披萨
     * 添加配料 ...浓浓的大蒜番茄酱
     * 烘烤25分钟。
     * 把比萨饼切成方块状。
     * 将披萨放到披萨商店的盒子中。
     * 
     */
}
