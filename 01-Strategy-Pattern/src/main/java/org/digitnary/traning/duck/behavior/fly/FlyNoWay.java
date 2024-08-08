package org.digitnary.traning.duck.behavior.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This Duck Can't Fly Anyway");
    }
}
