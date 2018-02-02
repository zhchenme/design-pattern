package com.jas.jdk.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    /**
     * 通过构造函数，将当前对象记录为观察者
     * 
     * @param observable 主题对象
     */
    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Current conditions list : " + "温度 = " +
                temperature + ", 湿度 = " + humidity + ", 气压 = " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
