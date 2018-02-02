package com.jas.strategy;

public class RedheadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Redhead Duck!");
    }
    public static void main(String[] args) {
        
        Duck redheadDuck = new RedheadDuck();
        
        redheadDuck.setQuackBehavior(new Quack());
        redheadDuck.setFlyBehavior(new FlyWithWings());
        
        redheadDuck.performQuack();
        redheadDuck.performFly();
    }

}
