package org.digitnary.traning;

import org.digitnary.traning.duck.behavior.fly.FlyRocketPowered;
import org.digitnary.traning.duck.duck.Duck;
import org.digitnary.traning.duck.duck.MallardDuck;
import org.digitnary.traning.puzzle.behavior.AxeBehavior;
import org.digitnary.traning.puzzle.character.Character;
import org.digitnary.traning.puzzle.character.King;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new AxeBehavior());
        king.weaponBehavior.useWeapon();
        king.fight();
    }
}