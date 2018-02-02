package com.jas.strategy;

public class SQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("SQuack!");
    }
}
