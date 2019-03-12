package strategy.puzzle.heroes;

import strategy.puzzle.Character;
import strategy.puzzle.behavior.SwordBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}