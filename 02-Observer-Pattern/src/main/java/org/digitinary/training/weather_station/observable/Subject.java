package org.digitinary.training.weather_station.observable;

import org.digitinary.training.weather_station.observer.Observer;

public interface Subject {
 public void registerObserver(Observer observer);
 public void removeObserver(Observer observer);
 public void notifyObservers();
}
