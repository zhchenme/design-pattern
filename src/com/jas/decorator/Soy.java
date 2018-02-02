package com.jas.decorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage = null;
    
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy ";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
