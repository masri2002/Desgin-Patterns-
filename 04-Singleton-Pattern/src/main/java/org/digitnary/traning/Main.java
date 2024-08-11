package org.digitnary.traning;

import org.digitnary.traning.singleton.ChocolateBoiler;

public class Main {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler=ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler2=ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        System.out.println(chocolateBoiler2.isEmpty());
        System.out.println(chocolateBoiler.isEmpty());
        chocolateBoiler2.boil();
        System.out.println(chocolateBoiler2.isBoiled());
        System.out.println(chocolateBoiler.isBoiled());
    }
}