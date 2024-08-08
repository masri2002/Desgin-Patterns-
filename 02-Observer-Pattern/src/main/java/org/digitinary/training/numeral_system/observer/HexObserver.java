package org.digitinary.training.numeral_system.observer;

import org.digitinary.training.numeral_system.ovservable.NumberingSystem;

public class HexObserver implements Observe{
    private NumberingSystem numberingSystem;

    public HexObserver(NumberingSystem numberingSystem) {
        this.numberingSystem = numberingSystem;
         this.numberingSystem.add(this);
    }
    @Override
    public void update() {
        System.out.println("Hexadecimal String :"  +
              Integer.toHexString(numberingSystem.getState())  );
    }
}
