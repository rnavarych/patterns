package puzzle.behavior;

import puzzle.interfaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Удар топором");
    }
}
