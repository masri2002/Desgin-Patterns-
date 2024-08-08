package org.digitinary.training;


import org.digitinary.training.weather_station.observer.CurrentConditionsDisplay;
import org.digitinary.training.weather_station.observer.ForecastDisplay;
import org.digitinary.training.weather_station.observer.StatisticsDisplay;
import org.digitinary.training.weather_station.observable.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData= new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("---------------------------------------");
        weatherData.notifyObservers();
        System.out.println("-----------------------------------------");
        weatherData.notifyObservers();

    }
}

