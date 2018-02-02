package com.jas.state;

/**
 * @author Jas
 * @create 2018-01-31 10:39
 **/
public class HasCoinState implements  State {
    CandyMachine candyMachine;
    
    public HasCoinState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("你已经投入了一个硬币，不能再投入硬币了！");
    }

    /**
     * 在糖果机有一个硬币的时候，你可以申请退回你的硬币，并改变糖果机的状态
     */
    @Override
    public void ejectCoin() {
        System.out.println("您的硬币已退回！");
        candyMachine.setState(candyMachine.getNoCoinState());
    }

    /**
     * 糖果机有硬币的时候，你可以转动曲柄，从而获得糖果，并改变糖果机的状态
     */
    @Override
    public void turnCrank() {
        System.out.println("你转动了曲柄，请稍等 ...");
        candyMachine.setState(candyMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("现在还没有糖果发放！");
    }
}
