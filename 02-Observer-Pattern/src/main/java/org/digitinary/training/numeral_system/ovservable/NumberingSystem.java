package org.digitinary.training.numeral_system.ovservable;

import org.digitinary.training.numeral_system.observer.Observe;

import java.util.ArrayList;
import java.util.List;

public class NumberingSystem implements Subject{

    List<Observe>observes;
    int state;

    public NumberingSystem() {
        this.observes = new ArrayList<>();
    }

    @Override
    public void add(Observe observe) {
       this.observes.add(observe);
    }

    @Override
    public void remove(Observe observe) {
      this.observes.remove(observe);
    }

    @Override
    public void notifyObserves() {
        observes.forEach(observe -> observe.update());
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObserves();
    }
}
