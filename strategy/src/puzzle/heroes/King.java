package puzzle.heroes;

import puzzle.Character;
import puzzle.behavior.KnifeBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
