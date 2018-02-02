package com.jas.observer;

/**
 * 主题接口
 */
public interface Subject {

    /**
     *  注册观察者
     *  
     * @param observer 观察者对象
     */
    void registObserver(Observer observer);

    /**
     *  移除观察者
     *
     * @param observer 观察者对象
     */
    void removeObserver(Observer observer);

    /**
     * 当主题状态改变时，这个方法会被调用，通知所有的观察者
     */
    void notifyObservers();
}
