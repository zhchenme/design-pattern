package com.jas.simplefactory;

public class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = null;
        pizza = SimplePizzaFactory.createPizzs(type);
        
        return pizza;
    }
}
