package com.jas.observer;

/**
 * 观察者对象，实现了Observer 接口和DisplayElement 接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    /**
     * 通过构造函数将当前观察者注册给主题对象
     * 
     * @param weatherData 主题对象
     */
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    /**
     * 布告板信息展示
     */
    @Override
    public void display() {
        System.out.println("Current conditions list : " + "温度 = " + 
                temperature + ", 湿度 = " + humidity + ", 气压 = " + pressure);
    }

    /**
     * 更新信息
     * @param temp 温度
     * @param humidity  湿度
     * @param pressure  压力
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
