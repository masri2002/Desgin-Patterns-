package org.digitinary.training.weather_station.observable;

import org.digitinary.training.weather_station.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> list;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
       list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
       list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach((observer -> observer.update(temperature,humidity,pressure)));
    }
    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
