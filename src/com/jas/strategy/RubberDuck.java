package com.jas.strategy;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
    
    public static void main(String[] args) {
        
        Duck rubberDuck = new RubberDuck();
        
        rubberDuck.setQuackBehavior(new SQuack());
        rubberDuck.setFlyBehavior(new FlyNoWay());
        
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}
