package org.digitnary.traning.duck.duck;

import org.digitnary.traning.duck.behavior.fly.FlyBehavior;
import org.digitnary.traning.duck.behavior.fly.FlyWithWings;
import org.digitnary.traning.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior=new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
