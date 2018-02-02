package com.jas.abstractfactory;

public class SHPizzaStore {
    PizzaInfgredientFactory infgredientFactory = new SHPizzaInfgredientFactory();
    
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        
        if("cheese".equals(type)){
            pizza = new CheesePizza(infgredientFactory);
            pizza.name = "原料来自上海工厂加工的奶酪披萨";
        }
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
