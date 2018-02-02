package com.jas.state;

/**
 * @author Jas
 * @create 2018-01-31 10:41
 **/
public class SoldOutState implements State {
    CandyMachine candyMachine;
    
    public SoldOutState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("请不要再投入硬币了，糖果已经卖完了！");
    }

    @Override
    public void ejectCoin() {
        System.out.println("您没有投入硬币，所以现在不能弹出硬币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("即使你转动了曲柄，但还是不会出糖果，因为已经没有糖果了！");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已经卖完了，没有糖果用于发放了!");
    }
}
