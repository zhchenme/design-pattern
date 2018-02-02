package com.jas.state;

/**
 * @author Jas
 * @create 2018-01-31 10:40
 **/
public class SoldState implements State {
    CandyMachine candyMachine;
    
    public SoldState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("请稍等，马上为您发放一个糖果！");
    }

    @Override
    public void ejectCoin() {
        System.out.println("您已经转动了曲柄，现在不能再退回硬币了！");
    }

    @Override
    public void turnCrank() {
        System.out.println("您已经转动了曲柄一次，多余的转动是无效的！");
    }

    /**
     * 分发糖果，并根据糖果机中的糖果数量，改变糖果机的状态
     */
    @Override
    public void dispense() {
        candyMachine.releaseBall();
        
        //如果糖果机中有糖果，将糖果机置为初始没有硬币的状态
        if(candyMachine.getCount() > 0){
            candyMachine.setState(candyMachine.getNoCoinState());
        }else {
            System.out.println("糖果已经售卖完了，请改天再来！");
            candyMachine.setState(candyMachine.getSoldOutState());
        }
    }
}
