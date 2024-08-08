package org.digitinary.training.numeral_system.ovservable;

import org.digitinary.training.numeral_system.observer.Observe;

public interface Subject {
    void add(Observe observe);
    void remove(Observe observe);
    void notifyObserves();


}
