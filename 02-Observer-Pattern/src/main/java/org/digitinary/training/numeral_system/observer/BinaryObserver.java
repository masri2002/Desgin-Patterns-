package org.digitinary.training.numeral_system.observer;

import org.digitinary.training.numeral_system.ovservable.NumberingSystem;

public class BinaryObserver implements Observe{
   private NumberingSystem numberingSystem;

    public BinaryObserver(NumberingSystem numberingSystem) {
        this.numberingSystem = numberingSystem;
        this.numberingSystem.add(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String " +
              Integer.toBinaryString(numberingSystem.getState()));
    }
}
