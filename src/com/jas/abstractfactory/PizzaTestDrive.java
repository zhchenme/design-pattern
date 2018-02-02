package com.jas.abstractfactory;


public class PizzaTestDrive {
    public static void main(String[] args) {

        SHPizzaStore pizzaStore = new SHPizzaStore();
        pizzaStore.createPizza("cheese");
    }
    /**
     * 准备原料来自上海工厂加工的奶酪披萨
     * 烘烤25分钟。
     * 把比萨饼切成对角片。
     * 将披萨放到披萨商店的盒子中。
     */
}
