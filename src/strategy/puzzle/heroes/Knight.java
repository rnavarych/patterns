package strategy.puzzle.heroes;

import strategy.puzzle.Character;
import strategy.puzzle.behavior.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
