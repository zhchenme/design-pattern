package com.jas.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象，实现了Subject 接口
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> list = new ArrayList();
    
    
    @Override
    public void registObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = list.indexOf(observer);
        if(i >= 0 && i < list.size()){
            list.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当气象站的数据得到更新后，通知观察者，调用notifyObservers() 方法
     */
        public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 当气象站数据改变后，设置新的数据值,并调用measurementsChanged() 方法
     * 
     * @param temperature  温度
     * @param humidity  湿度
     * @param pressure  气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
