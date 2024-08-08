package org.digitnary.traning.duck.duck;

import org.digitnary.traning.duck.behavior.fly.FlyBehavior;
import org.digitnary.traning.duck.behavior.quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck() {

    }
    public abstract void display();

    public void preformQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All Ducks are Swimming");
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
}
