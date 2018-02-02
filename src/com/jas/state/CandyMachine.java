package com.jas.state;

/**
 * 糖果机类
 * @author Jas
 * @create 2018-01-31 10:35
 **/
public class CandyMachine {
    State noCoinState;
    State hasCoinState;
    State soldState;
    State soldOutState;

    State state = soldOutState;
    /** 刚开始糖果机中是没有糖果的，所以count 为0 */
    int count  = 0;    

    /**
     * 通过构造函数实例化所有状态对象
     * @param numberCandys 初始化糖果机中的糖果数量
     */
    public CandyMachine(int numberCandys){
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = numberCandys;
        
        //如果超过0颗糖果，就把状态设为noCoinState
        if(numberCandys > 0){
            state = noCoinState;
        }
    }
    
    public void insertCoin(){
        state.insertCoin();
    }
    
    public void ejectCoin(){
        state.ejectCoin();
    }
    
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    /**
     * 该方法用于释放糖果，并将count 的数量减一
     */
    void releaseBall(){
        System.out.println("糖果机释放一个糖果 ...");
        if (count != 0){
            count --;
        }
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state){
        this.state = state;
    }
}
