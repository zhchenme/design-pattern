package com.jas.factorymethod;

import com.jas.simplefactory.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = null;
        
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    /**
     * 将生产比萨的方法定义成抽象方法，让子类去实现
     * @param type 比萨的类型
     * @return 对应的比萨实例
     */
    protected abstract Pizza createPizza(String type);
}
