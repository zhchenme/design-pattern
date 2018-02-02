package com.jas.abstractfactory;

public class CheesePizza extends Pizza {
    PizzaInfgredientFactory infgredientFactory = null;
    
    public CheesePizza(PizzaInfgredientFactory infgredientFactory){
        this.infgredientFactory = infgredientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("准备" + name);
        dough = infgredientFactory.createDough();
        cheese = infgredientFactory.createCheese();
    }
}
