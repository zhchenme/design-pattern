package com.jas.state;

/**
 * @author Jas
 * @create 2018-01-31 10:30
 **/
public class NoCoinState implements State {
    CandyMachine candyMachine;
    
    public  NoCoinState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    /**
     * 投入硬币后，将糖果机置为有一个硬币的状态
     */
    @Override
    public void insertCoin() {
        System.out.println("你投入了一个硬币！");
        candyMachine.setState(candyMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("你还没有投入一个硬币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("即使你转动了曲柄，但是不会出糖果，因为你没有投入硬币！");
    }

    @Override
    public void dispense() {
        System.out.println("你需要先投入一个硬币！");
    }
}
