package strategy.puzzle.heroes;

import strategy.puzzle.Character;
import strategy.puzzle.behavior.KnifeBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
