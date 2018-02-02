package com.jas.decorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage = null;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha ";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
