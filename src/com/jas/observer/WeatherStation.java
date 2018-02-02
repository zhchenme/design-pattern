package com.jas.observer;

public class WeatherStation {
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(18,65,30);
    }
    /**
     * 输出
     * Current conditions list : 温度 = 18.0, 湿度 = 65.0, 气压 = 30.0
     * Forecast conditions list : 温度 = 17.0, 湿度 = 64.0, 气压 = 29.0
     */
}
