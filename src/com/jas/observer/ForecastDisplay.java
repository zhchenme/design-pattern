package com.jas.observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    /**
     * 通过构造函数将当前观察者注册给主题对象
     *
     * @param weatherData 主题对象
     */
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Forecast conditions list : " + "温度 = " +
                (temperature - 1.0) + ", 湿度 = " + (humidity - 1.0) + ", 气压 = " + (pressure - 1.0));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
