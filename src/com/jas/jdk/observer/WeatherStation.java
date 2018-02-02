package com.jas.jdk.observer;


public class WeatherStation {
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(80,65,30.4f);
    }
    /**
     * 输出
     * Current conditions list : 温度 = 80.0, 湿度 = 65.0, 气压 = 30.4
     */
}

 