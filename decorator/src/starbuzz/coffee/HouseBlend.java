package starbuzz.coffee;

import starbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    public double cost() {
        return 0.89;
    }
}
