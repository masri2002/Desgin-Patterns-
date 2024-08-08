package org.digitinary.training.numeral_system.observer;

import org.digitinary.training.numeral_system.ovservable.NumberingSystem;

public class OctalObserver implements Observe{
    private NumberingSystem numberingSystem;

    public OctalObserver(NumberingSystem numberingSystem) {
        this.numberingSystem = numberingSystem;
        this.numberingSystem.add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String :" +
                Integer.toOctalString(numberingSystem.getState()));
    }
}
