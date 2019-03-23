package strategy.puzzle.heroes;

import strategy.puzzle.Character;
import strategy.puzzle.behavior.AxeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
