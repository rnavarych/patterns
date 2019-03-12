package strategy.animals;

import strategy.animals.interfaces.FlyBehaviour;
import strategy.animals.interfaces.QuackBehaviour;

public abstract class Duck {

    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;

    public abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

}
