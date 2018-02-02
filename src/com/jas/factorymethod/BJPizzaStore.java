package com.jas.factorymethod;

import com.jas.simplefactory.Pizza;

public class BJPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        
        if("cheese".equals(type)){
            pizza =  new BJCheesePizza();
        }else if("greek".equals(type)){
            pizza = new BJGreekPizza();
        }
        
        return pizza;
    }
}
