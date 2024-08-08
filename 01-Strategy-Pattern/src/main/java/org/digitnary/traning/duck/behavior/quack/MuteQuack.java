package org.digitnary.traning.duck.behavior.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This Duck Silent lol :P");
    }
}
