package com.jas.observer;

/**
 * 观察者接口，所有观察者都应该实现该接口
 */
public interface Observer {

    /**
     * 当气象观测值改变时，主题会把这些状态值作为参数，传送给观察者
     * 
     * @param temp 温度
     * @param humidity  湿度
     * @param pressure  压力
     */
    void update(float temp, float humidity, float pressure);
}
