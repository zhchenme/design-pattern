package com.jas.state;

/**
 * @author Jas
 * @create 2018-01-31 11:04
 **/
public class CansyMachineTestDrive {
    public static void main(String[] args) {
        
        //初始化糖果机中的糖果数量为1 个
        CandyMachine candyMachine = new CandyMachine(1);    
        
        candyMachine.insertCoin();
        candyMachine.ejectCoin();
        
        System.out.println("======================");
        
        candyMachine.insertCoin();
        candyMachine.turnCrank();
        
        System.out.println("======================");
        
        candyMachine.insertCoin();
        candyMachine.turnCrank();
    }
    /**
     * 你投入了一个硬币！
     * 您的硬币已退回！
     * ======================
     * 你投入了一个硬币！
     * 你转动了曲柄，请稍等 ...
     * 糖果机释放一个糖果 ...
     * 糖果已经售卖完了，请改天再来！
     * ======================
     * 请不要再投入硬币了，糖果已经卖完了！
     * 即使你转动了曲柄，但还是不会出糖果，因为已经没有糖果了！
     * 糖果已经卖完了，没有糖果用于发放了!
     */
}
