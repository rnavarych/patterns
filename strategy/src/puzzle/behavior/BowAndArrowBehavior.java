package puzzle.behavior;

import puzzle.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Лук и стрелы");
    }
}