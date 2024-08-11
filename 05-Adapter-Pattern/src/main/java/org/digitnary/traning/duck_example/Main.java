package org.digitnary.traning.duck_example;


import org.digitnary.traning.duck_example.adapter.Duck;
import org.digitnary.traning.duck_example.adapter.MallardDuck;
import org.digitnary.traning.duck_example.adapter.TurkeyAdapter;
import org.digitnary.traning.duck_example.adapter.WildTurkey;

public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}