package SimUDuck.Kinds;

import SimUDuck.Interfaces.*;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("This is " + this.getClass().getSimpleName());
    }
}
