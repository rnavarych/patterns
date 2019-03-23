package puzzle;

import puzzle.interfaces.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    protected void setWeapon(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

}
