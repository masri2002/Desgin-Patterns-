package org.digitnary.traning.puzzle.character;

import org.digitnary.traning.puzzle.behavior.WeaponBehavior;

public abstract class Character {
   public WeaponBehavior weaponBehavior;
    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }
}
