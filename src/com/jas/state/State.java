package com.jas.state;

/**
 * 所有的状态接口
 * @author Jas
 * @create 2018-01-31 10:28
 **/
public interface State {
    /** 投入一个硬币 */
    void insertCoin();
    /** 弹出硬币 */
    void ejectCoin();
    /** 转动曲柄 */
    void turnCrank();
    /** 糖果分发或告罄 */
    void dispense();
}
