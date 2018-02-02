package com.jas.jdk.observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    
    public void measurementsChanged(){
        //在通知所有观察者之前，先调用setChanged() 方法，用来表示状态已经改变
        setChanged();
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public float getTemperature(){
        return temperature;
    }
    
    public float getHumidity(){
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
