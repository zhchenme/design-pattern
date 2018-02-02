package com.jas.simplefactory;

public class SimplePizzaFactory {
    private SimplePizzaFactory(){};
    
    public static Pizza createPizzs(String type){
        Pizza pizza = null;
        
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("greek".equals(type)){
            pizza = new GreekPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
