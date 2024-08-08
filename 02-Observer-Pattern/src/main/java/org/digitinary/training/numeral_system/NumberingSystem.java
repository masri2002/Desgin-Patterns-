package org.digitinary.training.numeral_system;

import org.digitinary.training.numeral_system.observer.BinaryObserver;
import org.digitinary.training.numeral_system.observer.HexObserver;
import org.digitinary.training.numeral_system.observer.OctalObserver;

public class NumberingSystem {
    public static void main(String[] args) {
        org.digitinary.training.numeral_system.ovservable.NumberingSystem numberingSystem = new org.digitinary.training.numeral_system.ovservable.NumberingSystem();

        OctalObserver octalObserver = new OctalObserver(numberingSystem);

        BinaryObserver binaryObserver= new BinaryObserver(numberingSystem);

        HexObserver hexObserver=new HexObserver(numberingSystem);

        numberingSystem.setState(15);

    }
}
