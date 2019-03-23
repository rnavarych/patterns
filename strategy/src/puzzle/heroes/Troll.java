package puzzle.heroes;

import puzzle.Character;
import puzzle.behavior.SwordBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}